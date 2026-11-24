package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.DoubleAltArrowUp: SolarIcon
    get() {
        if (_doubleAltArrowUp != null) return _doubleAltArrowUp!!
        _doubleAltArrowUp = SolarIcon(
            name = "Solar.Broken.DoubleAltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 13L12 7L10.25 8.5M5 13L7.33333 11"),
                IconPath("M5 17L12 11L13.75 12.5M19 17L16.6667 15"),
            ),
        )
        return _doubleAltArrowUp!!
    }

private var _doubleAltArrowUp: SolarIcon? = null
