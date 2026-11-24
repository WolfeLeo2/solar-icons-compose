package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Screencast: SolarIcon
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = SolarIcon(
            name = "Solar.Linear.Screencast",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 20C17.7712 20 19.6569 20 20.8284 18.8284C22 17.6569 22 15.7712 22 12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4H6.5C6.03566 4 5.80349 4 5.60793 4.01926C3.70882 4.20631 2.20631 5.70882 2.01926 7.60793C2 7.80349 2 8.03566 2 8.5"),
                IconPath("M11 20C11 15.0294 6.97056 11 2 11"),
                IconPath("M8 20C8 16.6863 5.31371 14 2 14"),
                IconPath("M5 20C5 18.3431 3.65685 17 2 17"),
            ),
        )
        return _screencast!!
    }

private var _screencast: SolarIcon? = null
