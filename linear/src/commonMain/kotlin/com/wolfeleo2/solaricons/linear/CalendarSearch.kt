package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CalendarSearch: SolarIcon
    get() {
        if (_calendarSearch != null) return _calendarSearch!!
        _calendarSearch = SolarIcon(
            name = "Solar.Linear.CalendarSearch",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 14V12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4H10C6.22876 4 4.34315 4 3.17157 5.17157C2 6.34315 2 8.22876 2 12V14C2 17.7712 2 19.6569 3.17157 20.8284C4.34315 22 6.22876 22 10 22H14"),
                IconPath("M7 4V2.5"),
                IconPath("M17 4V2.5"),
                IconPath("M18.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M20.5 20.5L22 22"),
                IconPath("M2.5 9H21.5"),
            ),
        )
        return _calendarSearch!!
    }

private var _calendarSearch: SolarIcon? = null
