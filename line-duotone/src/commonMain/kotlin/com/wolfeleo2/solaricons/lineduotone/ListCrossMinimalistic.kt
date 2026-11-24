package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListCrossMinimalistic: SolarIcon
    get() {
        if (_listCrossMinimalistic != null) return _listCrossMinimalistic!!
        _listCrossMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.ListCrossMinimalistic",
            secondaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M11 11L3 11"),
                IconPath("M11 16H3"),
            ),
            primaryPaths = listOf(
                IconPath("M15 16L20 11M20 16L15 11"),
            ),
        )
        return _listCrossMinimalistic!!
    }

private var _listCrossMinimalistic: SolarIcon? = null
