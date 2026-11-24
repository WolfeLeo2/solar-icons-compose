package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MagniferZoomIn: SolarIcon
    get() {
        if (_magniferZoomIn != null) return _magniferZoomIn!!
        _magniferZoomIn = SolarIcon(
            name = "Solar.LineDuotone.MagniferZoomIn",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5 2.0 a9.5 9.5 0 1 0 0 19.0 a9.5 9.5 0 1 0 0 -19.0z"),
                IconPath("M18.5 18.5L22 22"),
                IconPath("M9 11.5H11.5M11.5 11.5H14M11.5 11.5V14M11.5 11.5V9"),
            ),
        )
        return _magniferZoomIn!!
    }

private var _magniferZoomIn: SolarIcon? = null
