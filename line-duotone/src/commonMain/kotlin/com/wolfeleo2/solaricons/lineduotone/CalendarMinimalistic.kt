package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CalendarMinimalistic: SolarIcon
    get() {
        if (_calendarMinimalistic != null) return _calendarMinimalistic!!
        _calendarMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.CalendarMinimalistic",
            secondaryPaths = listOf(
                IconPath("M7 4V2.5"),
                IconPath("M17 4V2.5"),
                IconPath("M2 9H22"),
            ),
            primaryPaths = listOf(
                IconPath("M2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H14C17.7712 4 19.6569 4 20.8284 5.17157C22 6.34315 22 8.22876 22 12V14C22 17.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14V12Z"),
            ),
        )
        return _calendarMinimalistic!!
    }

private var _calendarMinimalistic: SolarIcon? = null
