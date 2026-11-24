package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.WineglassTriangle: SolarIcon
    get() {
        if (_wineglassTriangle != null) return _wineglassTriangle!!
        _wineglassTriangle = SolarIcon(
            name = "Solar.LineDuotone.WineglassTriangle",
            secondaryPaths = listOf(
                IconPath("M12 14.5713V20.9999"),
                IconPath("M7.47314 9.75H16.5268"),
            ),
            primaryPaths = listOf(
                IconPath("M16.2439 21H7.7561M4.70095 3H19.2991C20.7999 3 21.5624 4.79409 20.5162 5.86382L12.7149 13.8404C12.3227 14.2415 11.6773 14.2415 11.2851 13.8404L3.48381 5.86382C2.43759 4.79409 3.20008 3 4.70095 3Z"),
            ),
        )
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: SolarIcon? = null
