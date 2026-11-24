package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SortHorizontal: SolarIcon
    get() {
        if (_sortHorizontal != null) return _sortHorizontal!!
        _sortHorizontal = SolarIcon(
            name = "Solar.Linear.SortHorizontal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 8L6 8M6 8L10.125 4M6 8L10.125 12"),
                IconPath("M6 16L18 16M18 16L13.875 12M18 16L13.875 20"),
            ),
        )
        return _sortHorizontal!!
    }

private var _sortHorizontal: SolarIcon? = null
