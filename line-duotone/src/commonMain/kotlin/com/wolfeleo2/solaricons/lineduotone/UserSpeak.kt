package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UserSpeak: SolarIcon
    get() {
        if (_userSpeak != null) return _userSpeak!!
        _userSpeak = SolarIcon(
            name = "Solar.LineDuotone.UserSpeak",
            secondaryPaths = listOf(
                IconPath("M18 17.5C18 19.9853 18 22 10 22C2 22 2 19.9853 2 17.5C2 15.0147 5.58172 13 10 13C14.4183 13 18 15.0147 18 17.5Z"),
            ),
            primaryPaths = listOf(
                IconPath("M10.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M19 2C19 2 21 3.2 21 6C21 8.8 19 10 19 10"),
                IconPath("M17 4C17 4 18 4.6 18 6C18 7.4 17 8 17 8"),
            ),
        )
        return _userSpeak!!
    }

private var _userSpeak: SolarIcon? = null
