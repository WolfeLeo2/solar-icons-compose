package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ListDownMinimalistic: SolarIcon
    get() {
        if (_listDownMinimalistic != null) return _listDownMinimalistic!!
        _listDownMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.ListDownMinimalistic",
            secondaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M20 11L3 11"),
                IconPath("M10 16H3"),
            ),
            primaryPaths = listOf(
                IconPath("M14 15L17.5 18L21 15"),
            ),
        )
        return _listDownMinimalistic!!
    }

private var _listDownMinimalistic: SolarIcon? = null
