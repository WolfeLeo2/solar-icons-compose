package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.MagniferZoomIn: SolarIcon
    get() {
        if (_magniferZoomIn != null) return _magniferZoomIn!!
        _magniferZoomIn = SolarIcon(
            name = "Solar.Broken.MagniferZoomIn",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18.5 18.5L22 22"),
                IconPath("M9 11.5H11.5M11.5 11.5H14M11.5 11.5V14M11.5 11.5V9"),
                IconPath("M6.75 3.27093C8.14732 2.46262 9.76964 2 11.5 2C16.7467 2 21 6.25329 21 11.5C21 16.7467 16.7467 21 11.5 21C6.25329 21 2 16.7467 2 11.5C2 9.76964 2.46262 8.14732 3.27093 6.75"),
            ),
        )
        return _magniferZoomIn!!
    }

private var _magniferZoomIn: SolarIcon? = null
