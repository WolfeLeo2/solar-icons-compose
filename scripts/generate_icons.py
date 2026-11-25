#!/usr/bin/env python3
"""
Generates the Kotlin icon sources for every style module from the Solar SVG catalogue
maintained at https://github.com/saoudi-h/solar-icons (packages/core/svgs).

Usage:
    git clone --depth 1 https://github.com/saoudi-h/solar-icons /tmp/solar-icons
    python3 scripts/generate_icons.py /tmp/solar-icons

The catalogue is laid out as svgs/<category>/<Style>/<kebab-name>.svg. Every icon must exist in
all six styles; the script fails loudly on anything it does not understand instead of guessing.
"""

import json
import math
import shutil
import subprocess
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
BASE_PACKAGE = "io.github.wolfeleo2.solaricons"

# (catalogue dir, module dir, package segment, SolarIcons group)
STYLES = [
    ("Bold", "bold", "bold", "Bold"),
    ("BoldDuotone", "bold-duotone", "boldduotone", "BoldDuotone"),
    ("Linear", "linear", "linear", "Linear"),
    ("LineDuotone", "line-duotone", "lineduotone", "LineDuotone"),
    ("Broken", "broken", "broken", "Broken"),
    ("Outline", "outline", "outline", "Outline"),
]

CAPS = {"butt": None, "round": "StrokeCap.Round", "square": "StrokeCap.Square"}
JOINS = {"miter": None, "round": "StrokeJoin.Round", "bevel": "StrokeJoin.Bevel"}


def fail(msg):
    raise SystemExit(f"error: {msg}")


def num(v):
    s = f"{v:.4f}".rstrip("0").rstrip(".")
    return "0" if s in ("", "-0") else s


def pascal(kebab):
    return "".join(p[:1].upper() + p[1:] for p in kebab.split("-") if p)


def camel(kebab):
    p = pascal(kebab)
    return p[:1].lower() + p[1:]


def ellipse_d(cx, cy, rx, ry, deg=0.0):
    # Two half arcs. Rotation goes into the arc's x-axis-rotation so no transform is needed.
    t = math.radians(deg)
    x1, y1 = cx + rx * math.cos(t), cy + rx * math.sin(t)
    x2, y2 = cx - rx * math.cos(t), cy - rx * math.sin(t)
    a = f"A{num(rx)} {num(ry)} {num(deg)} 1 0"
    return f"M{num(x1)} {num(y1)}{a} {num(x2)} {num(y2)}{a} {num(x1)} {num(y1)}Z"


def rect_d(x, y, w, h, rx, ry):
    rx, ry = min(rx, w / 2), min(ry, h / 2)
    if rx == 0 or ry == 0:
        return f"M{num(x)} {num(y)}H{num(x + w)}V{num(y + h)}H{num(x)}Z"
    a = f"A{num(rx)} {num(ry)} 0 0 1"
    return (
        f"M{num(x + rx)} {num(y)}H{num(x + w - rx)}{a} {num(x + w)} {num(y + ry)}"
        f"V{num(y + h - ry)}{a} {num(x + w - rx)} {num(y + h)}H{num(x + rx)}{a} {num(x)} {num(y + h - ry)}"
        f"V{num(y + ry)}{a} {num(x + rx)} {num(y)}Z"
    )


def shape_d(tag, a, where):
    f = lambda k, d=0.0: float(a.get(k, d))
    transform = a.get("transform")
    if tag == "path":
        if transform:
            fail(f"{where}: transform on <path> is not supported")
        return a["d"]
    if tag == "circle":
        if transform:
            fail(f"{where}: transform on <circle> is not supported")
        return ellipse_d(f("cx"), f("cy"), f("r"), f("r"))
    if tag == "ellipse":
        deg = 0.0
        if transform:
            parts = transform.removeprefix("rotate(").removesuffix(")").replace(",", " ").split()
            if not transform.startswith("rotate(") or len(parts) != 3:
                fail(f"{where}: unsupported transform {transform!r}")
            deg, px, py = map(float, parts)
            if abs(px - f("cx")) > 1e-3 or abs(py - f("cy")) > 1e-3:
                fail(f"{where}: ellipse rotated around a point other than its centre")
        return ellipse_d(f("cx"), f("cy"), f("rx"), f("ry"), deg)
    if tag == "rect":
        if transform:
            fail(f"{where}: transform on <rect> is not supported")
        rx = a.get("rx", a.get("ry", "0"))
        ry = a.get("ry", rx)
        return rect_d(f("x"), f("y"), f("width"), f("height"), float(rx), float(ry))
    fail(f"{where}: unsupported element <{tag}>")


def ref_id(url, where):
    if not (url.startswith("url(#") and url.endswith(")")):
        fail(f"{where}: unsupported reference {url!r}")
    return url[5:-1]


def parse_svg(path):
    """Returns (primary, secondary) lists of IconPath constructor argument strings."""
    root = ET.parse(path).getroot()
    for el in root.iter():
        el.tag = el.tag.split("}", 1)[-1]
        el.attrib = {k.split("}", 1)[-1]: v for k, v in el.attrib.items()}
    where = str(path)
    if root.get("viewBox") != "0 0 24 24":
        fail(f"{where}: unexpected viewBox {root.get('viewBox')!r}")
    ids = {el.get("id"): el for el in root.iter() if el.get("id")}
    primary, secondary = [], []

    def emit(tag, attrs, opacity):
        fill, stroke = attrs.get("fill", "none"), attrs.get("stroke", "none")
        for paint in (fill, stroke):
            if paint not in ("none", "black"):
                fail(f"{where}: unexpected paint {paint!r}")
        if (fill == "none") == (stroke == "none"):
            fail(f"{where}: element must be exactly one of filled or stroked")
        args = [json.dumps(shape_d(tag, attrs, where))]
        if attrs.get("fill-rule") == "evenodd":
            args.append("fillType = PathFillType.EvenOdd")
        if stroke != "none":
            # SVG default stroke width is 1; most Solar strokes set 1.5 explicitly.
            args.append(f"strokeWidth = {num(float(attrs.get('stroke-width', '1')))}f")
            cap = CAPS[attrs.get("stroke-linecap", "butt")]
            join = JOINS[attrs.get("stroke-linejoin", "miter")]
            if cap:
                args.append(f"strokeCap = {cap}")
            if join:
                args.append(f"strokeJoin = {join}")
        if "mask" in attrs:
            # Solar only uses masks as "clip the stroke to its own shape" (inside strokes),
            # which is the same as clipping to the mask's single white path.
            mask = ids[ref_id(attrs["mask"], where)]
            kids = list(mask)
            if len(kids) != 1 or kids[0].tag != "path" or mask.get("fill") != "white":
                fail(f"{where}: unsupported mask shape")
            args.append(f"clip = {json.dumps(kids[0].get('d'))}")
        if opacity == 1.0:
            primary.append(", ".join(args))
        elif opacity == 0.5:
            secondary.append(", ".join(args))
        else:
            fail(f"{where}: unexpected opacity {opacity}")

    def walk(el, opacity):
        for child in el:
            tag = child.tag
            op = opacity * float(child.get("opacity", "1"))
            if tag in ("defs", "clipPath", "mask", "title", "desc"):
                continue
            if tag == "g":
                extra = set(child.attrib) - {"opacity", "clip-path"}
                if extra:
                    fail(f"{where}: unsupported <g> attributes {extra}")
                if "clip-path" in child.attrib:
                    clip = list(ids[ref_id(child.get("clip-path"), where)])
                    full = (
                        len(clip) == 1 and clip[0].tag == "rect"
                        and clip[0].get("width") == "24" and clip[0].get("height") == "24"
                        and float(clip[0].get("x", 0)) == 0 and float(clip[0].get("y", 0)) == 0
                    )
                    if not full:
                        fail(f"{where}: only full-viewport clip paths are supported")
                walk(child, op)
            elif tag == "use":
                target = ids[child.get("href", "").removeprefix("#")]
                attrs = {k: v for k, v in child.attrib.items() if k != "href"}
                attrs.update(target.attrib)  # referenced element's own attributes win
                emit(target.tag, attrs, op)
            else:
                emit(tag, child.attrib, op)

    walk(root, 1.0)
    if not primary and not secondary:
        fail(f"{where}: no drawable content")
    return primary, secondary


def render(pkg, group, name, kebab, primary, secondary, aliases):
    prop = pascal(kebab)
    backing = f"_{camel(kebab)}"
    body = "\n".join(primary + secondary)
    imports = [
        "androidx.compose.ui.graphics.PathFillType" if "PathFillType." in body else None,
        "androidx.compose.ui.graphics.StrokeCap" if "StrokeCap." in body else None,
        "androidx.compose.ui.graphics.StrokeJoin" if "StrokeJoin." in body else None,
        f"{BASE_PACKAGE}.SolarIcons",
        f"{BASE_PACKAGE}.core.IconPath",
        f"{BASE_PACKAGE}.core.SolarIcon",
    ]

    def layer(label, paths):
        if not paths:
            return ""
        rows = "".join(f"            IconPath({p}),\n" for p in paths)
        return f"        {label} = listOf(\n{rows}        ),\n"

    out = [
        "// Generated by scripts/generate_icons.py. Do not edit.",
        f"package {pkg}",
        "",
        *[f"import {i}" for i in imports if i],
        "",
        f"public val SolarIcons.{group}.{prop}: SolarIcon get() = {backing}",
    ]
    for alias, reason in aliases:
        msg = f"{reason} Use {prop} instead."
        out += [
            "",
            f"@Deprecated({json.dumps(msg)}, ReplaceWith({json.dumps(prop)}))",
            f"public val SolarIcons.{group}.{alias}: SolarIcon get() = {backing}",
        ]
    out += [
        "",
        f"private val {backing}: SolarIcon by lazy {{",
        "    SolarIcon(",
        f"        name = {json.dumps(name)},",
        layer("primaryPaths", primary) + layer("secondaryPaths", secondary) + "    )",
        "}",
        "",
    ]
    return "\n".join(out)


def main():
    if len(sys.argv) != 2:
        fail("usage: generate_icons.py <path to a saoudi-h/solar-icons checkout>")
    upstream = Path(sys.argv[1]).resolve()
    svgs = upstream / "packages/core/svgs"
    if not svgs.is_dir():
        fail(f"{svgs} not found")

    icons = {}  # kebab -> {style: path}
    for category in sorted(p for p in svgs.iterdir() if p.is_dir()):
        for style, *_ in STYLES:
            for f in sorted((category / style).glob("*.svg")):
                entry = icons.setdefault(f.stem, {"category": category.name, "files": {}})
                if entry["category"] != category.name:
                    fail(f"{f.stem} exists in both {entry['category']} and {category.name}")
                entry["files"][style] = f

    seen = {}
    for kebab, entry in icons.items():
        missing = [s for s, *_ in STYLES if s not in entry["files"]]
        if missing:
            fail(f"{kebab} is missing styles {missing}")
        key = pascal(kebab).lower()  # macOS/Windows file systems are case-insensitive
        if key in seen:
            fail(f"{kebab} and {seen[key]} map to the same Kotlin name")
        seen[key] = kebab

    aliases = {}
    descriptions = upstream / "packages/core/src/metadata-descriptions.json"
    if descriptions.exists():
        for e in json.loads(descriptions.read_text()):
            for alias in e.get("deprecatedAliases") or []:
                if pascal(alias["name"]).lower() in seen:
                    fail(f"deprecated alias {alias['name']} collides with an icon")
                aliases.setdefault(e["name"], []).append((pascal(alias["name"]), alias["reason"]))

    # Names shipped in solar-icons-compose 1.x (generated from 480-Design/Solar-Icon-Set), per style module.
    legacy = json.loads((ROOT / "scripts/legacy-aliases.json").read_text())
    by_pascal = {pascal(k): k for k in icons}

    for style, module, segment, group in STYLES:
        pkg = f"{BASE_PACKAGE}.{segment}"
        # Style modules contain only generated code, so start from an empty source root.
        shutil.rmtree(ROOT / module / "src/commonMain/kotlin", ignore_errors=True)
        out_dir = ROOT / module / "src/commonMain/kotlin" / pkg.replace(".", "/")
        out_dir.mkdir(parents=True)
        style_aliases = {k: list(v) for k, v in aliases.items()}
        for old, new in legacy.get(module, {}).items():
            if new not in by_pascal:
                fail(f"legacy alias {old} points to unknown icon {new}")
            if old in by_pascal or any(old == a for v in style_aliases.values() for a, _ in v):
                continue  # still a real name or already an alias
            style_aliases.setdefault(by_pascal[new], []).append((old, "Renamed in 2.0.0."))
        for kebab in sorted(icons):
            primary, secondary = parse_svg(icons[kebab]["files"][style])
            name = f"Solar.{group}.{pascal(kebab)}"
            src = render(pkg, group, name, kebab, primary, secondary, style_aliases.get(kebab, []))
            (out_dir / f"{pascal(kebab)}.kt").write_text(src)

    commit = subprocess.run(
        ["git", "-C", str(upstream), "rev-parse", "HEAD"], capture_output=True, text=True
    ).stdout.strip()
    (ROOT / "scripts/UPSTREAM_COMMIT").write_text((commit or "unknown") + "\n")
    print(f"Generated {len(icons)} icons x {len(STYLES)} styles from {commit or upstream}")


if __name__ == "__main__":
    main()
