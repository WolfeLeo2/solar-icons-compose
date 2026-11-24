package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundDoubleAltArrowDown: SolarIcon
    get() {
        if (_roundDoubleAltArrowDown != null) return _roundDoubleAltArrowDown!!
        _roundDoubleAltArrowDown = SolarIcon(
            name = "Solar.Linear.RoundDoubleAltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M9 8.5L12 11.5L15 8.5"),
                IconPath("M9 12.5L12 15.5L15 12.5"),
            ),
        )
        return _roundDoubleAltArrowDown!!
    }

private var _roundDoubleAltArrowDown: SolarIcon? = null
