package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.QuitFullScreen: SolarIcon
    get() {
        if (_quitFullScreen != null) return _quitFullScreen!!
        _quitFullScreen = SolarIcon(
            name = "Solar.Linear.QuitFullScreen",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 22C14 18.2288 14 16.3431 15.1716 15.1716C16.3431 14 18.2288 14 22 14"),
                IconPath("M2 14C5.77124 14 7.65685 14 8.82843 15.1716C10 16.3431 10 18.2288 10 22"),
                IconPath("M2 10C5.77124 10 7.65685 10 8.82843 8.82843C10 7.65685 10 5.77124 10 2"),
                IconPath("M22 10C18.2288 10 16.3431 10 15.1716 8.82843C14 7.65685 14 5.77124 14 2"),
            ),
        )
        return _quitFullScreen!!
    }

private var _quitFullScreen: SolarIcon? = null
