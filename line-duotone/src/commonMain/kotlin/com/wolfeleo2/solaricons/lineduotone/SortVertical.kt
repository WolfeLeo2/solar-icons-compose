package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SortVertical: SolarIcon
    get() {
        if (_sortVertical != null) return _sortVertical!!
        _sortVertical = SolarIcon(
            name = "Solar.LineDuotone.SortVertical",
            secondaryPaths = listOf(
                IconPath("M16 18L16 6M16 6L20 10.125M16 6L12 10.125"),
            ),
            primaryPaths = listOf(
                IconPath("M8 6L8 18M8 18L12 13.875M8 18L4 13.875"),
            ),
        )
        return _sortVertical!!
    }

private var _sortVertical: SolarIcon? = null
