package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Help: SolarIcon
    get() {
        if (_help != null) return _help!!
        _help = SolarIcon(
            name = "Solar.Linear.Help",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M12.0 8.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M15 9L19 5"),
                IconPath("M5 19L9 15"),
                IconPath("M9 9L5 5"),
                IconPath("M19 19L15 15"),
            ),
        )
        return _help!!
    }

private var _help: SolarIcon? = null
