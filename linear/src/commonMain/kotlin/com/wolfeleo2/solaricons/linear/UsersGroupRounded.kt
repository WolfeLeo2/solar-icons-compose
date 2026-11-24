package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UsersGroupRounded: SolarIcon
    get() {
        if (_usersGroupRounded != null) return _usersGroupRounded!!
        _usersGroupRounded = SolarIcon(
            name = "Solar.Linear.UsersGroupRounded",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M15 9C16.6569 9 18 7.65685 18 6C18 4.34315 16.6569 3 15 3"),
                IconPath("M18 14C19.7542 14.3847 21 15.3589 21 16.5C21 17.5293 19.9863 18.4229 18.5 18.8704"),
            ),
        )
        return _usersGroupRounded!!
    }

private var _usersGroupRounded: SolarIcon? = null
