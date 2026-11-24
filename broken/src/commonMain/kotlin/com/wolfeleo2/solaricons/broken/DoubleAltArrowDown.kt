package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.DoubleAltArrowDown: SolarIcon
    get() {
        if (_doubleAltArrowDown != null) return _doubleAltArrowDown!!
        _doubleAltArrowDown = SolarIcon(
            name = "Solar.Broken.DoubleAltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 11L12 17L10.25 15.5M5 11L7.33333 13"),
                IconPath("M5 7L12 13L13.75 11.5M19 7L16.6667 9"),
            ),
        )
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: SolarIcon? = null
