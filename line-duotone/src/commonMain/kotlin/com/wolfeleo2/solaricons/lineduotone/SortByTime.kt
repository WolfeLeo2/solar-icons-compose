package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SortByTime: SolarIcon
    get() {
        if (_sortByTime != null) return _sortByTime!!
        _sortByTime = SolarIcon(
            name = "Solar.LineDuotone.SortByTime",
            secondaryPaths = listOf(
                IconPath("M10 7L2 7"),
                IconPath("M8 12H2"),
                IconPath("M10 17H2"),
            ),
            primaryPaths = listOf(
                IconPath("M17.0 7.0 a5.0 5.0 0 1 0 0 10.0 a5.0 5.0 0 1 0 0 -10.0z"),
                IconPath("M17 10V11.8462L18 13"),
            ),
        )
        return _sortByTime!!
    }

private var _sortByTime: SolarIcon? = null
