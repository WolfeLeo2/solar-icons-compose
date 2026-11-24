package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundAltArrowUp: SolarIcon
    get() {
        if (_roundAltArrowUp != null) return _roundAltArrowUp!!
        _roundAltArrowUp = SolarIcon(
            name = "Solar.Linear.RoundAltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M15 13.5L12 10.5L9 13.5"),
            ),
        )
        return _roundAltArrowUp!!
    }

private var _roundAltArrowUp: SolarIcon? = null
