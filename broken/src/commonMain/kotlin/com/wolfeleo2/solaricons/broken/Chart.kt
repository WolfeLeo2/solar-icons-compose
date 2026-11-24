package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Chart: SolarIcon
    get() {
        if (_chart != null) return _chart!!
        _chart = SolarIcon(
            name = "Solar.Broken.Chart",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 22H2"),
                IconPath("M21 22V14.5C21 13.6716 20.3284 13 19.5 13H16.5C15.6716 13 15 13.6716 15 14.5V22"),
                IconPath("M15 22V9M9 22V5C9 3.58579 9 2.87868 9.43934 2.43934C9.87868 2 10.5858 2 12 2C13.4142 2 14.1213 2 14.5607 2.43934C15 2.87868 15 3.58579 15 5V5"),
                IconPath("M9 22V9.5C9 8.67157 8.32843 8 7.5 8H4.5C3.67157 8 3 8.67157 3 9.5V16M3 22V19.75"),
            ),
        )
        return _chart!!
    }

private var _chart: SolarIcon? = null
