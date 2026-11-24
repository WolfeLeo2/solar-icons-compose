package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UserMinusRounded: SolarIcon
    get() {
        if (_userMinusRounded != null) return _userMinusRounded!!
        _userMinusRounded = SolarIcon(
            name = "Solar.Linear.UserMinusRounded",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M17.0 14.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M16 18L18 18"),
                IconPath("M14 20.8344C13.3663 20.9421 12.695 21 12 21C8.13401 21 5 19.2091 5 17C5 14.7909 8.13401 13 12 13C13.7135 13 15.2832 13.3518 16.5 13.9359"),
            ),
        )
        return _userMinusRounded!!
    }

private var _userMinusRounded: SolarIcon? = null
