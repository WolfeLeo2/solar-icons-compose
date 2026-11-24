package com.wolfeleo2.solaricons.core

import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

/**
 * Solar Icons default brand palette constants matching https://solaricons.dev.
 */
public object SolarDefaults {
    /** Default Solar primary color (#1C274C). */
    public val PrimaryColor: Color = Color(0xFF1C274C)

    /** Default Solar secondary (duotone) color: #1C274C with 50% opacity. */
    public val SecondaryColor: Color = Color(0x801C274C)
}

/**
 * Path definition for a Solar Icon layer.
 */
public data class IconPath(
    val data: String,
    val fillType: PathFillType = PathFillType.NonZero,
)

/**
 * Represents a Solar Icon with separated primary (foreground/accent) and secondary (duotone background) layers.
 */
public class SolarIcon(
    public val name: String,
    public val primaryPaths: List<IconPath> = emptyList(),
    public val secondaryPaths: List<IconPath> = emptyList(),
) {
    /** Default vector combining both layers with default Solar brand colors. */
    public val imageVector: ImageVector by lazy { asImageVector() }

    /**
     * Primary full-opacity layer only, drawn without the secondary duotone background.
     * Matches Flutter's `SolarDuotoneIconData.primary`.
     */
    public val primaryVector: ImageVector by lazy {
        val builder = ImageVector.Builder(
            name = "${name}.Primary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        )
        for (p in primaryPaths) {
            builder.addPath(
                pathData = PathParser().parsePathString(p.data).toNodes(),
                pathFillType = p.fillType,
                fill = SolidColor(SolarDefaults.PrimaryColor),
            )
        }
        builder.build()
    }

    /**
     * Converts this icon to a Compose [ImageVector] with custom duotone colors.
     *
     * @param primaryColor Color for foreground details. Defaults to [SolarDefaults.PrimaryColor] if null.
     * @param secondaryColor Color for duotone background layer. Defaults to [primaryColor] with [secondaryOpacity],
     *                       or [SolarDefaults.SecondaryColor] if [primaryColor] is also null.
     * @param secondaryOpacity Opacity factor applied to [secondaryColor] when derived from [primaryColor]. Defaults to 0.5f.
     */
    public fun asImageVector(
        primaryColor: Color? = null,
        secondaryColor: Color? = null,
        secondaryOpacity: Float = 0.5f,
    ): ImageVector {
        val resolvedPrimary = primaryColor ?: SolarDefaults.PrimaryColor
        val resolvedSecondary = secondaryColor ?: (primaryColor?.copy(alpha = secondaryOpacity) ?: SolarDefaults.SecondaryColor)

        val builder = ImageVector.Builder(
            name = name,
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        )

        for (p in secondaryPaths) {
            builder.addPath(
                pathData = PathParser().parsePathString(p.data).toNodes(),
                pathFillType = p.fillType,
                fill = SolidColor(resolvedSecondary),
                fillAlpha = resolvedSecondary.alpha,
            )
        }

        for (p in primaryPaths) {
            builder.addPath(
                pathData = PathParser().parsePathString(p.data).toNodes(),
                pathFillType = p.fillType,
                fill = SolidColor(resolvedPrimary),
                fillAlpha = resolvedPrimary.alpha,
            )
        }

        return builder.build()
    }
}

/**
 * Drop-in Composable matching Flutter's `SolarDuotoneIcon` / `SolarIcon` widget contract.
 *
 * Designed to integrate cleanly with Compose Material 3 theming:
 * - When [primaryColor] is null, falls back to ambient [LocalContentColor.current] (or [SolarDefaults.PrimaryColor]
 *   if ambient color is unspecified).
 * - When [secondaryColor] is null, automatically derives from [primaryColor] using [secondaryOpacity] (50% alpha).
 * - When [secondaryColor] is explicitly supplied, renders independent dual-tone colors.
 */
@Composable
public fun SolarIcon(
    icon: SolarIcon,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    primaryColor: Color? = null,
    secondaryColor: Color? = null,
    secondaryOpacity: Float = 0.5f,
) {
    val ambient = LocalContentColor.current
    val resolvedPrimary = primaryColor
        ?: if (ambient.isSpecified && ambient != Color.Unspecified) ambient else SolarDefaults.PrimaryColor
    val resolvedSecondary = secondaryColor
        ?: (primaryColor?.copy(alpha = secondaryOpacity)
            ?: (if (ambient.isSpecified && ambient != Color.Unspecified) ambient.copy(alpha = secondaryOpacity) else SolarDefaults.SecondaryColor))

    val vector = remember(icon, resolvedPrimary, resolvedSecondary) {
        icon.asImageVector(resolvedPrimary, resolvedSecondary)
    }
    Icon(
        imageVector = vector,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = Color.Unspecified,
    )
}
