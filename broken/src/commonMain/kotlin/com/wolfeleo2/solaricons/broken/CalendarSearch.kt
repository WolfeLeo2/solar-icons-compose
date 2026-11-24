package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CalendarSearch: SolarIcon
    get() {
        if (_calendarSearch != null) return _calendarSearch!!
        _calendarSearch = SolarIcon(
            name = "Solar.Broken.CalendarSearch",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 14V12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4M14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14V12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4"),
                IconPath("M7 4V2.5"),
                IconPath("M17 4V2.5"),
                IconPath("M18.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M20.5 20.5L22 22"),
                IconPath("M21.5 9H16.625H10.75M2 9H5.875"),
            ),
        )
        return _calendarSearch!!
    }

private var _calendarSearch: SolarIcon? = null
