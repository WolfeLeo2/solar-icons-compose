package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MenuDotsCircle: SolarIcon
    get() {
        if (_menuDotsCircle != null) return _menuDotsCircle!!
        _menuDotsCircle = SolarIcon(
            name = "Solar.Linear.MenuDotsCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7.99988 12H8.00889M12.0044 12H12.0134M15.9909 12H15.9999"),
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
        )
        return _menuDotsCircle!!
    }

private var _menuDotsCircle: SolarIcon? = null
