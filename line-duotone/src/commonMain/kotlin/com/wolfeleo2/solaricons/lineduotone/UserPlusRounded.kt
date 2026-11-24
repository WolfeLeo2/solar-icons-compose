package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UserPlusRounded: SolarIcon
    get() {
        if (_userPlusRounded != null) return _userPlusRounded!!
        _userPlusRounded = SolarIcon(
            name = "Solar.LineDuotone.UserPlusRounded",
            secondaryPaths = listOf(
                IconPath("M14 20.8344C13.3663 20.9421 12.695 21 12 21C8.13401 21 5 19.2091 5 17C5 14.7909 8.13401 13 12 13C13.7135 13 15.2832 13.3518 16.5 13.9359"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M17.0 14.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M17 16.6665V19.3332"),
                IconPath("M15.6665 18L18.3332 18"),
            ),
        )
        return _userPlusRounded!!
    }

private var _userPlusRounded: SolarIcon? = null
