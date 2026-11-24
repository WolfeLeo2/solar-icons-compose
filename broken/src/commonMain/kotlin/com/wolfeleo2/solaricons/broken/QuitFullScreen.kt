package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.QuitFullScreen: SolarIcon
    get() {
        if (_quitFullScreen != null) return _quitFullScreen!!
        _quitFullScreen = SolarIcon(
            name = "Solar.Broken.QuitFullScreen",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 14C5.77124 14 7.65685 14 8.82843 15.1716C10 16.3431 10 18.2288 10 22"),
                IconPath("M2 10C3.16976 10 4.15811 10 5 9.96504M10 2C10 5.77124 10 7.65685 8.82843 8.82843"),
                IconPath("M14 22C14 18.2288 14 16.3431 15.1716 15.1716M22 14C20.8302 14 19.8419 14 19 14.035"),
                IconPath("M22 10C18.2288 10 16.3431 10 15.1716 8.82843C14 7.65685 14 5.77124 14 2"),
            ),
        )
        return _quitFullScreen!!
    }

private var _quitFullScreen: SolarIcon? = null
