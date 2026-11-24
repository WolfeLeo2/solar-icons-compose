package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MinimalisticMagniferZoomIn: SolarIcon
    get() {
        if (_minimalisticMagniferZoomIn != null) return _minimalisticMagniferZoomIn!!
        _minimalisticMagniferZoomIn = SolarIcon(
            name = "Solar.Linear.MinimalisticMagniferZoomIn",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5 2.0 a9.5 9.5 0 1 0 0 19.0 a9.5 9.5 0 1 0 0 -19.0z"),
                IconPath("M9 11.5H11.5M11.5 11.5H14M11.5 11.5V14M11.5 11.5V9"),
                IconPath("M20 20L22 22"),
            ),
        )
        return _minimalisticMagniferZoomIn!!
    }

private var _minimalisticMagniferZoomIn: SolarIcon? = null
