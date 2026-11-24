package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.DoubleAltArrowDown: SolarIcon
    get() {
        if (_doubleAltArrowDown != null) return _doubleAltArrowDown!!
        _doubleAltArrowDown = SolarIcon(
            name = "Solar.Linear.DoubleAltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 11L12 17L5 11"),
                IconPath("M19 7L12 13L5 7"),
            ),
        )
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: SolarIcon? = null
