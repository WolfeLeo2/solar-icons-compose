package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListArrowDown: SolarIcon
    get() {
        if (_listArrowDown != null) return _listArrowDown!!
        _listArrowDown = SolarIcon(
            name = "Solar.LineDuotone.ListArrowDown",
            secondaryPaths = listOf(
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
            ),
            primaryPaths = listOf(
                IconPath("M15 17.5L17.5 20M17.5 20L20 17.5M17.5 20V14"),
            ),
        )
        return _listArrowDown!!
    }

private var _listArrowDown: SolarIcon? = null
