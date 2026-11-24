package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Stopwatch: SolarIcon
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = SolarIcon(
            name = "Solar.Linear.Stopwatch",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 13C21 17.9706 16.9706 22 12 22C7.02944 22 3 17.9706 3 13C3 8.02944 7.02944 4 12 4C16.9706 4 21 8.02944 21 13Z"),
                IconPath("M12 13V9"),
                IconPath("M10 2H14"),
            ),
        )
        return _stopwatch!!
    }

private var _stopwatch: SolarIcon? = null
