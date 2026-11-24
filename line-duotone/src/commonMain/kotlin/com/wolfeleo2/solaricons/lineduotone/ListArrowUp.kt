package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListArrowUp: SolarIcon
    get() {
        if (_listArrowUp != null) return _listArrowUp!!
        _listArrowUp = SolarIcon(
            name = "Solar.LineDuotone.ListArrowUp",
            secondaryPaths = listOf(
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
            ),
            primaryPaths = listOf(
                IconPath("M20 16.5L17.5 14M17.5 14L15 16.5M17.5 14V20"),
            ),
        )
        return _listArrowUp!!
    }

private var _listArrowUp: SolarIcon? = null
