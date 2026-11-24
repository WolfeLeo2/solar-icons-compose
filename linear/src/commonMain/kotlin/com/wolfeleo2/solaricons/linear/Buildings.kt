package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Buildings: SolarIcon
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = SolarIcon(
            name = "Solar.Linear.Buildings",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 22L2 22"),
                IconPath("M21 22V6C21 4.11438 21 3.17157 20.4143 2.58579C19.8285 2 18.8857 2 17 2H15C13.1144 2 12.1716 2 11.5858 2.58579C11.1143 3.05733 11.0223 3.76022 11.0044 5"),
                IconPath("M15 22V9C15 7.11438 15 6.17157 14.4142 5.58579C13.8284 5 12.8856 5 11 5H7C5.11438 5 4.17157 5 3.58579 5.58579C3 6.17157 3 7.11438 3 9V22"),
                IconPath("M9 22V19"),
                IconPath("M6 8H12"),
                IconPath("M6 11H12"),
                IconPath("M6 14H12"),
            ),
        )
        return _buildings!!
    }

private var _buildings: SolarIcon? = null
