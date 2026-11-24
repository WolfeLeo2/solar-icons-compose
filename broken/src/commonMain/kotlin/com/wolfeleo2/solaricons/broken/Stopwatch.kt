package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Stopwatch: SolarIcon
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = SolarIcon(
            name = "Solar.Broken.Stopwatch",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 13V9"),
                IconPath("M10 2H14"),
                IconPath("M7.5 5.20404C8.82378 4.43827 10.3607 4 12 4C16.9706 4 21 8.02944 21 13C21 17.9706 16.9706 22 12 22C7.02944 22 3 17.9706 3 13C3 11.3607 3.43827 9.82378 4.20404 8.5"),
            ),
        )
        return _stopwatch!!
    }

private var _stopwatch: SolarIcon? = null
