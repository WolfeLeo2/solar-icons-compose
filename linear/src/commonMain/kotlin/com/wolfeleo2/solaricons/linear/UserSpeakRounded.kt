package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UserSpeakRounded: SolarIcon
    get() {
        if (_userSpeakRounded != null) return _userSpeakRounded!!
        _userSpeakRounded = SolarIcon(
            name = "Solar.Linear.UserSpeakRounded",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M19 2C19 2 21 3.2 21 6C21 8.8 19 10 19 10"),
                IconPath("M17 4C17 4 18 4.6 18 6C18 7.4 17 8 17 8"),
            ),
        )
        return _userSpeakRounded!!
    }

private var _userSpeakRounded: SolarIcon? = null
