package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListCheckMinimalistic: SolarIcon
    get() {
        if (_listCheckMinimalistic != null) return _listCheckMinimalistic!!
        _listCheckMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.ListCheckMinimalistic",
            secondaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M10 11L3 11"),
                IconPath("M10 16H3"),
            ),
            primaryPaths = listOf(
                IconPath("M14 13.5L16.1 16L20 11"),
            ),
        )
        return _listCheckMinimalistic!!
    }

private var _listCheckMinimalistic: SolarIcon? = null
