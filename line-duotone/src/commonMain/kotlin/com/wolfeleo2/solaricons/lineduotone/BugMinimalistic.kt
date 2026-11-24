package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BugMinimalistic: SolarIcon
    get() {
        if (_bugMinimalistic != null) return _bugMinimalistic!!
        _bugMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.BugMinimalistic",
            secondaryPaths = listOf(
                IconPath("M19 13H22"),
                IconPath("M5 13H2"),
                IconPath("M20.4999 7L18.7021 7.71909"),
                IconPath("M3.50012 7L5.29785 7.71909"),
                IconPath("M14.5 3.5L17 2"),
                IconPath("M9.5 3.5L7 2"),
                IconPath("M20.5 19.0002L18.5 18.2002"),
                IconPath("M3.5 19.0002L5.5 18.2002"),
                IconPath("M10.5 10.5H13.5"),
                IconPath("M10.5 15.5H13.5"),
            ),
            primaryPaths = listOf(
                IconPath("M5 10C5 6.13401 8.13401 3 12 3C15.866 3 19 6.13401 19 10V15C19 18.866 15.866 22 12 22C8.13401 22 5 18.866 5 15V10Z"),
            ),
        )
        return _bugMinimalistic!!
    }

private var _bugMinimalistic: SolarIcon? = null
