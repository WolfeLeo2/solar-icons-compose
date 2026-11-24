package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Sort: SolarIcon
    get() {
        if (_sort != null) return _sort!!
        _sort = SolarIcon(
            name = "Solar.Broken.Sort",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 7L9 7M2 7L5 7"),
                IconPath("M19 12H16M5 12L12 12"),
                IconPath("M16 17H8"),
            ),
        )
        return _sort!!
    }

private var _sort: SolarIcon? = null
