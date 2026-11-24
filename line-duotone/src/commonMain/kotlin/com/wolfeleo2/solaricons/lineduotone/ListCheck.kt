package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListCheck: SolarIcon
    get() {
        if (_listCheck != null) return _listCheck!!
        _listCheck = SolarIcon(
            name = "Solar.LineDuotone.ListCheck",
            secondaryPaths = listOf(
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M10 14H3"),
                IconPath("M10 18H3"),
            ),
            primaryPaths = listOf(
                IconPath("M14 16L16.1 18.5L20 13.5"),
            ),
        )
        return _listCheck!!
    }

private var _listCheck: SolarIcon? = null
