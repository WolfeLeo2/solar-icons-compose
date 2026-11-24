package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Reorder: SolarIcon
    get() {
        if (_reorder != null) return _reorder!!
        _reorder = SolarIcon(
            name = "Solar.Linear.Reorder",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 10L5 10"),
                IconPath("M19 14L5 14"),
                IconPath("M19 6L5 6"),
                IconPath("M19 18L5 18"),
            ),
        )
        return _reorder!!
    }

private var _reorder: SolarIcon? = null
