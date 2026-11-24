package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListCross: SolarIcon
    get() {
        if (_listCross != null) return _listCross!!
        _listCross = SolarIcon(
            name = "Solar.Linear.ListCross",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 18.5L20 13.5M20 18.5L15 13.5"),
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
            ),
        )
        return _listCross!!
    }

private var _listCross: SolarIcon? = null
