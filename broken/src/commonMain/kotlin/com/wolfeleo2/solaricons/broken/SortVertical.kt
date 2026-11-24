package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SortVertical: SolarIcon
    get() {
        if (_sortVertical != null) return _sortVertical!!
        _sortVertical = SolarIcon(
            name = "Solar.Broken.SortVertical",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16 18L16 16M16 6L20 10.125M16 6L12 10.125M16 6L16 13"),
                IconPath("M8 18L12 13.875M8 18L4 13.875M8 18L8 11M8 6V8"),
            ),
        )
        return _sortVertical!!
    }

private var _sortVertical: SolarIcon? = null
