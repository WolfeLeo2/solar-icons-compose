package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UserHandUp: SolarIcon
    get() {
        if (_userHandUp != null) return _userHandUp!!
        _userHandUp = SolarIcon(
            name = "Solar.LineDuotone.UserHandUp",
            secondaryPaths = listOf(
                IconPath("M8 13V18C8 19.8856 8 20.8284 8.58579 21.4142C9.17157 22 10.1144 22 12 22C13.8856 22 14.8284 22 15.4142 21.4142C16 20.8284 16 19.8856 16 18V13"),
                IconPath("M12.0 2.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M20 21.5L19.3505 15.9795C19.1506 14.2804 17.7107 13 16 13H8C5 13 3.06717 10.2687 2.38197 7.52787L2 6"),
            ),
        )
        return _userHandUp!!
    }

private var _userHandUp: SolarIcon? = null
