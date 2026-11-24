package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.UsersGroupRounded: SolarIcon
    get() {
        if (_usersGroupRounded != null) return _usersGroupRounded!!
        _usersGroupRounded = SolarIcon(
            name = "Solar.BoldDuotone.UsersGroupRounded",
            secondaryPaths = listOf(
                IconPath("M15.0 3.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9.00098 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
            ),
        )
        return _usersGroupRounded!!
    }

private var _usersGroupRounded: SolarIcon? = null
