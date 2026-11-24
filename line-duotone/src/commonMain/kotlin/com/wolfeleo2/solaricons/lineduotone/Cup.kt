package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Cup: SolarIcon
    get() {
        if (_cup != null) return _cup!!
        _cup = SolarIcon(
            name = "Solar.LineDuotone.Cup",
            secondaryPaths = listOf(
                IconPath("M17 13H3"),
                IconPath("M22 21L2 21"),
            ),
            primaryPaths = listOf(
                IconPath("M3 7C3 5.11438 3 4.17157 3.58579 3.58579C4.17157 3 5.11438 3 7 3H13C14.8856 3 15.8284 3 16.4142 3.58579C17 4.17157 17 5.11438 17 7V12C17 14.8284 17 16.2426 16.1213 17.1213C15.2426 18 13.8284 18 11 18H9C6.17157 18 4.75736 18 3.87868 17.1213C3 16.2426 3 14.8284 3 12V7Z"),
                IconPath("M17 13H18C20.2091 13 22 11.2091 22 9C22 6.79086 20.2091 5 18 5H17"),
            ),
        )
        return _cup!!
    }

private var _cup: SolarIcon? = null
