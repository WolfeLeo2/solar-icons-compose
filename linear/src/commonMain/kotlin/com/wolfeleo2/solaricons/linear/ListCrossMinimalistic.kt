package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListCrossMinimalistic: SolarIcon
    get() {
        if (_listCrossMinimalistic != null) return _listCrossMinimalistic!!
        _listCrossMinimalistic = SolarIcon(
            name = "Solar.Linear.ListCrossMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M11 11L3 11"),
                IconPath("M11 16H3"),
                IconPath("M15 16L20 11M20 16L15 11"),
            ),
        )
        return _listCrossMinimalistic!!
    }

private var _listCrossMinimalistic: SolarIcon? = null
