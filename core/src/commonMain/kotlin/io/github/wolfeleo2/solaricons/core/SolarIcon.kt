package io.github.wolfeleo2.solaricons.core

import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp

/** Solar Icons default palette, matching https://solar-icons.vercel.app. */
public object SolarDefaults {
    /** Default Solar primary color (#1C274C). */
    public val PrimaryColor: Color = Color(0xFF1C274C)

    /** Default opacity of the duotone (secondary) layer. */
    public const val SecondaryOpacity: Float = 0.5f

    /** Stroke width the Solar stroked styles (Linear, Line Duotone, Broken) are designed at, in 24-unit viewport space. */
    public const val StrokeWidth: Float = 1.5f
}

/**
 * One shape of a Solar icon, in a 24x24 viewport.
 *
 * @param data SVG path data.
 * @param strokeWidth `null` for a filled shape; otherwise the shape is stroked at this width (viewport units).
 * @param clip Optional SVG path data the shape is clipped to (Solar uses this for inside strokes).
 */
public data class IconPath(
    val data: String,
    val fillType: PathFillType = PathFillType.NonZero,
    val strokeWidth: Float? = null,
    val strokeCap: StrokeCap = StrokeCap.Butt,
    val strokeJoin: StrokeJoin = StrokeJoin.Miter,
    val clip: String? = null,
)

/**
 * A Solar icon, split into a full-opacity primary layer and a duotone secondary layer
 * (empty for non-duotone styles). Path data is parsed once, on first use.
 */
public class SolarIcon(
    public val name: String,
    public val primaryPaths: List<IconPath> = emptyList(),
    public val secondaryPaths: List<IconPath> = emptyList(),
) {
    private val parsed by lazy {
        (primaryPaths + secondaryPaths).flatMap { listOfNotNull(it.data, it.clip) }.associateWith(::addPathNodes)
    }

    /**
     * Both layers in the Solar default color, the secondary one at 50% opacity.
     * Works with a plain `Icon(imageVector = ...)`, whose `tint` recolors both layers and keeps the duotone opacity.
     */
    public val imageVector: ImageVector by lazy { asImageVector() }

    /** The primary layer only. */
    public val primaryVector: ImageVector by lazy {
        build("$name.Primary", SolarDefaults.StrokeWidth, listOf(primaryPaths to SolarDefaults.PrimaryColor))
    }

    /**
     * Builds an [ImageVector] with custom colors.
     *
     * The secondary layer uses [secondaryColor] (defaulting to [primaryColor]) with its alpha multiplied by
     * [secondaryOpacity]. Like the source SVGs, each secondary shape gets its own opacity, so where they overlap
     * the overlap is darker (Solar relies on this, e.g. in Layers and Box).
     *
     * @param strokeWidth Stroke width for stroked styles, in viewport units. Filled styles ignore it.
     */
    public fun asImageVector(
        primaryColor: Color = SolarDefaults.PrimaryColor,
        secondaryColor: Color = primaryColor,
        secondaryOpacity: Float = SolarDefaults.SecondaryOpacity,
        strokeWidth: Float = SolarDefaults.StrokeWidth,
    ): ImageVector = build(
        name,
        strokeWidth,
        listOf(
            secondaryPaths to secondaryColor.copy(alpha = secondaryColor.alpha * secondaryOpacity),
            primaryPaths to primaryColor,
        ),
    )

    /** One layer in black at [alpha], for tinting with a color filter. */
    internal fun layer(paths: List<IconPath>, strokeWidth: Float, alpha: Float = 1f): ImageVector =
        build(name, strokeWidth, listOf(paths to Color.Black.copy(alpha = alpha)))

    private fun build(name: String, strokeWidth: Float, layers: List<Pair<List<IconPath>, Color>>): ImageVector {
        val scale = strokeWidth / SolarDefaults.StrokeWidth
        val builder = ImageVector.Builder(name, 24.dp, 24.dp, 24f, 24f)
        for ((paths, color) in layers) {
            // SolidColor carries the alpha; passing it again as fillAlpha would apply it twice.
            val brush = SolidColor(color)
            for (p in paths) {
                val nodes = parsed.getValue(p.data)
                val draw: ImageVector.Builder.() -> Unit = {
                    if (p.strokeWidth == null) {
                        addPath(nodes, p.fillType, fill = brush)
                    } else {
                        addPath(
                            nodes, p.fillType,
                            stroke = brush,
                            strokeLineWidth = p.strokeWidth * scale,
                            strokeLineCap = p.strokeCap,
                            strokeLineJoin = p.strokeJoin,
                            // Compose's Skia paint (desktop/iOS/web) caches its join as Round while Skia starts at
                            // Miter, so a Round request is skipped and sharp joins draw miter spikes. A miter limit
                            // of 1 turns those into bevels; real round joins (Android) ignore the limit.
                            strokeLineMiter = if (p.strokeJoin == StrokeJoin.Round) 1f else 4f,
                        )
                    }
                }
                if (p.clip == null) builder.draw() else builder.group(clipPathData = parsed.getValue(p.clip), block = draw)
            }
        }
        return builder.build()
    }
}

/**
 * Draws a [SolarIcon] with independent primary and duotone colors.
 *
 * - [primaryColor] defaults to the ambient [LocalContentColor], so the icon follows Material 3 theming,
 *   including the reduced alpha of disabled content.
 * - [secondaryColor] defaults to [primaryColor]. Its alpha is multiplied by [secondaryOpacity].
 * - [strokeWidth] applies to the stroked styles (Linear, Line Duotone, Broken), in 24-unit viewport space.
 */
@Composable
public fun SolarIcon(
    icon: SolarIcon,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    primaryColor: Color = Color.Unspecified,
    secondaryColor: Color = Color.Unspecified,
    secondaryOpacity: Float = SolarDefaults.SecondaryOpacity,
    strokeWidth: Float = SolarDefaults.StrokeWidth,
) {
    val primary = primaryColor.takeOrElse { LocalContentColor.current.takeOrElse { SolarDefaults.PrimaryColor } }
    val secondary = secondaryColor.takeOrElse { primary }

    val primaryPainter = rememberVectorPainter(remember(icon, strokeWidth) { icon.layer(icon.primaryPaths, strokeWidth) })
    val secondaryPainter = if (icon.secondaryPaths.isEmpty()) {
        null
    } else {
        rememberVectorPainter(
            remember(icon, strokeWidth, secondaryOpacity) { icon.layer(icon.secondaryPaths, strokeWidth, secondaryOpacity) },
        )
    }
    Icon(
        painter = remember(primaryPainter, secondaryPainter, primary, secondary) {
            DuotonePainter(primaryPainter, secondaryPainter, primary, secondary)
        },
        contentDescription = contentDescription,
        modifier = modifier,
        tint = Color.Unspecified,
    )
}

/**
 * Tints each layer separately, so color changes (including animated ones) don't rebuild any vector.
 * The tint multiplies its own alpha with the layer's, which keeps both the duotone opacity and a disabled alpha.
 */
private class DuotonePainter(
    private val primary: Painter,
    private val secondary: Painter?,
    private val primaryColor: Color,
    private val secondaryColor: Color,
) : Painter() {
    override val intrinsicSize: Size get() = primary.intrinsicSize

    override fun DrawScope.onDraw() {
        secondary?.run { draw(size, colorFilter = ColorFilter.tint(secondaryColor)) }
        with(primary) { draw(size, colorFilter = ColorFilter.tint(primaryColor)) }
    }
}
