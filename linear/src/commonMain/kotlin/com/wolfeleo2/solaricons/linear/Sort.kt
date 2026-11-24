package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Sort: SolarIcon
    get() {
        if (_sort != null) return _sort!!
        _sort = SolarIcon(
            name = "Solar.Linear.Sort",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 7L2 7"),
                IconPath("M19 12L5 12"),
                IconPath("M16 17H8"),
            ),
        )
        return _sort!!
    }

private var _sort: SolarIcon? = null
