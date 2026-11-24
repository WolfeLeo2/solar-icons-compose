package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UsersGroupRounded: SolarIcon
    get() {
        if (_usersGroupRounded != null) return _usersGroupRounded!!
        _usersGroupRounded = SolarIcon(
            name = "Solar.LineDuotone.UsersGroupRounded",
            secondaryPaths = listOf(
                IconPath("M12.5 4.3411C13.0375 3.53275 13.9565 3 15 3C16.6569 3 18 4.34315 18 6C18 7.65685 16.6569 9 15 9C13.9565 9 13.0375 8.46725 12.5 7.6589"),
                IconPath("M18 14C19.7542 14.3847 21 15.3589 21 16.5C21 17.5293 19.9863 18.4229 18.5 18.8704"),
            ),
            primaryPaths = listOf(
                IconPath("M9.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
            ),
        )
        return _usersGroupRounded!!
    }

private var _usersGroupRounded: SolarIcon? = null
