# Solar Icons for Compose Multiplatform

[![Maven Central](https://img.shields.io/maven-central/v/io.github.wolfeleo2.solaricons/solar-icons-all.svg)](https://central.sonatype.com/namespace/io.github.wolfeleo2.solaricons)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A **Compose Multiplatform** port of the [Solar Icon Set](https://www.figma.com/community/file/1166831539721848736) by 480 Design, modelled on the [Flutter package](https://github.com/saoudi-h/solar-icons/tree/main/packages/flutter) from [saoudi-h/solar-icons](https://github.com/saoudi-h/solar-icons).

**1,596 icons in each of the 6 styles (9,576 in total)** for:
- **Android**
- **iOS** (`iosArm64`, `iosSimulatorArm64`)
- **Desktop** (`jvm`)
- **Web** (`wasmJs`, `js`)

## Features

- **All 6 styles:** `Bold`, `BoldDuotone`, `Linear`, `LineDuotone`, `Broken`, `Outline`. Every icon is available in every style.
- **True strokes:** Linear, Line Duotone and Broken are drawn as real strokes (1.5 wide, rounded), like the originals, and the stroke width can be changed.
- **Duotone theming:** the secondary layer can have its own color and opacity, and follows Material 3's `LocalContentColor` (including disabled alpha) by default.
- **Modular artifacts:** depend on just the styles you use, or on `solar-icons-all`.
- **Lazy:** an icon is built the first time you use it, and its path data is parsed only once.

## Installation

In `gradle/libs.versions.toml`:

```toml
[versions]
solarIcons = "2.0.0"

[libraries]
solar-icons-bom = { module = "io.github.wolfeleo2.solaricons:solar-icons-bom", version.ref = "solarIcons" }

# Add only the styles you need (each one brings in solar-icons-core):
solar-icons-bold = { module = "io.github.wolfeleo2.solaricons:solar-icons-bold", version.ref = "solarIcons" }
solar-icons-bold-duotone = { module = "io.github.wolfeleo2.solaricons:solar-icons-bold-duotone", version.ref = "solarIcons" }
solar-icons-linear = { module = "io.github.wolfeleo2.solaricons:solar-icons-linear", version.ref = "solarIcons" }
solar-icons-line-duotone = { module = "io.github.wolfeleo2.solaricons:solar-icons-line-duotone", version.ref = "solarIcons" }
solar-icons-broken = { module = "io.github.wolfeleo2.solaricons:solar-icons-broken", version.ref = "solarIcons" }
solar-icons-outline = { module = "io.github.wolfeleo2.solaricons:solar-icons-outline", version.ref = "solarIcons" }

# Or everything:
solar-icons-all = { module = "io.github.wolfeleo2.solaricons:solar-icons-all", version.ref = "solarIcons" }
```

Multiplatform (`commonMain`):

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.solar.icons.bold.duotone)
            implementation(libs.solar.icons.linear)
        }
    }
}
```

To align versions with the BOM instead, drop `version.ref` from the style entries and add `implementation(project.dependencies.platform(libs.solar.icons.bom))`.

Android-only projects:

```kotlin
dependencies {
    implementation(libs.solar.icons.bold.duotone)
    implementation(libs.solar.icons.linear)
}
```

## Usage

Icons are extension properties on the `SolarIcons.<Style>` objects. Each one is a `SolarIcon`, imported from the style's package:

```kotlin
import io.github.wolfeleo2.solaricons.SolarIcons
import io.github.wolfeleo2.solaricons.boldduotone.Home
import io.github.wolfeleo2.solaricons.linear.Bell
```

### With Material 3 `Icon`

`imageVector` works with the standard `Icon`. `tint` recolors both layers and keeps the duotone layer at 50% opacity:

```kotlin
Icon(
    imageVector = SolarIcons.BoldDuotone.Home.imageVector,
    contentDescription = "Home",
    tint = MaterialTheme.colorScheme.primary,
)

Icon(SolarIcons.Linear.Bell.imageVector, contentDescription = "Notifications")
```

### With the `SolarIcon` composable

Use it for two-color duotone or a custom stroke width:

```kotlin
import io.github.wolfeleo2.solaricons.core.SolarIcon
import io.github.wolfeleo2.solaricons.boldduotone.User

SolarIcon(
    icon = SolarIcons.BoldDuotone.User,
    contentDescription = "Profile",
    primaryColor = Color(0xFF2E63E6),   // main shapes
    secondaryColor = Color(0xFF90B5FF), // duotone layer
    secondaryOpacity = 0.4f,
)

SolarIcon(SolarIcons.Linear.Bell, contentDescription = null, strokeWidth = 2f)
```

| Parameter | Default |
|---|---|
| `primaryColor` | `LocalContentColor.current` |
| `secondaryColor` | `primaryColor` |
| `secondaryOpacity` | `0.5f` (multiplied with the secondary color's alpha) |
| `strokeWidth` | `1.5f`, in 24×24 viewport units; filled styles ignore it |

Outside composition, `icon.asImageVector(primaryColor, secondaryColor, secondaryOpacity, strokeWidth)` builds the same thing as an `ImageVector`.

## Naming

Names are the catalogue's kebab-case names in PascalCase: `arrow-right` → `SolarIcons.Linear.ArrowRight`, `bag-2` → `Bag2`. Icons the catalogue has renamed keep their old name as a `@Deprecated` alias that points to the new one.

## Migrating from 1.x

1. **Packages:** replace `com.wolfeleo2.solaricons` with `io.github.wolfeleo2.solaricons` in your imports, so the package matches the Maven group.
2. **Renamed icons:** every name from 1.x still compiles as a `@Deprecated` alias with a quick-fix to the new name (for example `Magnifer` → `Magnifier`, `_4k` → `FourK`).
3. **`SolarIcon` colors:** `primaryColor` / `secondaryColor` are no longer nullable. Leave a parameter out to get its default, instead of passing `null`. `secondaryOpacity` now also applies when you pass `secondaryColor` explicitly.
4. **Rendering:** stroked styles now draw as real strokes, and the duotone layer draws at 50% (it was 25% by mistake in 1.x).

## Regenerating the icons

The style modules are generated from the [saoudi-h/solar-icons](https://github.com/saoudi-h/solar-icons) catalogue. To update them:

```sh
git clone --depth 1 https://github.com/saoudi-h/solar-icons /tmp/solar-icons
python3 scripts/generate_icons.py /tmp/solar-icons
```

The generator needs only Python 3's standard library and stops with an error on any SVG feature it doesn't support. `scripts/UPSTREAM_COMMIT` records which catalogue commit the icons came from.

## License

- Code: [MIT](LICENSE).
- Icon artwork: the [Solar Icon Set](https://www.figma.com/community/file/1166831539721848736) by 480 Design, licensed under [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/). **If you ship these icons, credit 480 Design.** See [LICENSE-THIRD-PARTY](LICENSE-THIRD-PARTY).
