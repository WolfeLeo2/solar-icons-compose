package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MinimalisticMagniferZoomOut: SolarIcon
    get() {
        if (_minimalisticMagniferZoomOut != null) return _minimalisticMagniferZoomOut!!
        _minimalisticMagniferZoomOut = SolarIcon(
            name = "Solar.LineDuotone.MinimalisticMagniferZoomOut",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5 2.0 a9.5 9.5 0 1 0 0 19.0 a9.5 9.5 0 1 0 0 -19.0z"),
                IconPath("M9 11.5H11.5H14"),
                IconPath("M20 20L22 22"),
            ),
        )
        return _minimalisticMagniferZoomOut!!
    }

private var _minimalisticMagniferZoomOut: SolarIcon? = null
