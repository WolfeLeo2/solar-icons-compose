package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CalendarAdd: SolarIcon
    get() {
        if (_calendarAdd != null) return _calendarAdd!!
        _calendarAdd = SolarIcon(
            name = "Solar.Broken.CalendarAdd",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 16L16 16M16 16L14 16M16 16L16 14M16 16L16 18"),
                IconPath("M7 4V2.5"),
                IconPath("M17 4V2.5"),
                IconPath("M21.5 9H16.625H10.75M2 9H5.875"),
                IconPath("M14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14V12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H14C17.7712 4 19.6569 4 20.8284 5.17157C22 6.34315 22 8.22876 22 12V14C22 17.7712 22 19.6569 20.8284 20.8284C20.1752 21.4816 19.3001 21.7706 18 21.8985"),
            ),
        )
        return _calendarAdd!!
    }

private var _calendarAdd: SolarIcon? = null
