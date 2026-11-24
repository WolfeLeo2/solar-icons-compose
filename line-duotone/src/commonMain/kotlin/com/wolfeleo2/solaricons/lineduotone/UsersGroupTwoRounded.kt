package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UsersGroupTwoRounded: SolarIcon
    get() {
        if (_usersGroupTwoRounded != null) return _usersGroupTwoRounded!!
        _usersGroupTwoRounded = SolarIcon(
            name = "Solar.LineDuotone.UsersGroupTwoRounded",
            secondaryPaths = listOf(
                IconPath("M18 9C19.6569 9 21 7.88071 21 6.5C21 5.11929 19.6569 4 18 4"),
                IconPath("M6 9C4.34315 9 3 7.88071 3 6.5C3 5.11929 4.34315 4 6 4"),
                IconPath("M20 19C21.7542 18.6153 23 17.6411 23 16.5C23 15.3589 21.7542 14.3847 20 14"),
                IconPath("M4 19C2.24575 18.6153 1 17.6411 1 16.5C1 15.3589 2.24575 14.3847 4 14"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
            ),
        )
        return _usersGroupTwoRounded!!
    }

private var _usersGroupTwoRounded: SolarIcon? = null
