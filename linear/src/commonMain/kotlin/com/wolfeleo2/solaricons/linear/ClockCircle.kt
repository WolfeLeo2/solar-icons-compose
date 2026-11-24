package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ClockCircle: SolarIcon
    get() {
        if (_clockCircle != null) return _clockCircle!!
        _clockCircle = SolarIcon(
            name = "Solar.Linear.ClockCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M12 8V12L14.5 14.5"),
            ),
        )
        return _clockCircle!!
    }

private var _clockCircle: SolarIcon? = null
