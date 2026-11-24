package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UserBlock: SolarIcon
    get() {
        if (_userBlock != null) return _userBlock!!
        _userBlock = SolarIcon(
            name = "Solar.Linear.UserBlock",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M15 13.3271C14.0736 13.1162 13.0609 13 12 13C7.58172 13 4 15.0147 4 17.5C4 19.9853 4 22 12 22C17.6874 22 19.3315 20.9817 19.8068 19.5"),
                IconPath("M15.1715 18.8284C15.8954 19.5523 16.8954 20 18 20C20.2091 20 22 18.2091 22 16C22 14.8954 21.5523 13.8954 20.8284 13.1715M15.1715 18.8284C14.4477 18.1045 14 17.1046 14 16C14 13.7909 15.7909 12 18 12C19.1046 12 20.1045 12.4477 20.8284 13.1715M15.1715 18.8284L20.8284 13.1715"),
            ),
        )
        return _userBlock!!
    }

private var _userBlock: SolarIcon? = null
