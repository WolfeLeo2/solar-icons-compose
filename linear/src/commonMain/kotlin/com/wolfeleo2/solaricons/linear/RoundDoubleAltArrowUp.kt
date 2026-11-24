package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundDoubleAltArrowUp: SolarIcon
    get() {
        if (_roundDoubleAltArrowUp != null) return _roundDoubleAltArrowUp!!
        _roundDoubleAltArrowUp = SolarIcon(
            name = "Solar.Linear.RoundDoubleAltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M9 15.5L12 12.5L15 15.5"),
                IconPath("M9 11.5L12 8.5L15 11.5"),
            ),
        )
        return _roundDoubleAltArrowUp!!
    }

private var _roundDoubleAltArrowUp: SolarIcon? = null
