package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SortVertical: SolarIcon
    get() {
        if (_sortVertical != null) return _sortVertical!!
        _sortVertical = SolarIcon(
            name = "Solar.Linear.SortVertical",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16 18L16 6M16 6L20 10.125M16 6L12 10.125"),
                IconPath("M8 6L8 18M8 18L12 13.875M8 18L4 13.875"),
            ),
        )
        return _sortVertical!!
    }

private var _sortVertical: SolarIcon? = null
