package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SortHorizontal: SolarIcon
    get() {
        if (_sortHorizontal != null) return _sortHorizontal!!
        _sortHorizontal = SolarIcon(
            name = "Solar.Broken.SortHorizontal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 8L10.125 4M6 8L10.125 12M6 8L13 8M18 8H16"),
                IconPath("M18 16L13.875 12M18 16L13.875 20M18 16L11 16M6 16H8"),
            ),
        )
        return _sortHorizontal!!
    }

private var _sortHorizontal: SolarIcon? = null
