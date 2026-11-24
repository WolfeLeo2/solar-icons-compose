package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListArrowUpMinimalistic: SolarIcon
    get() {
        if (_listArrowUpMinimalistic != null) return _listArrowUpMinimalistic!!
        _listArrowUpMinimalistic = SolarIcon(
            name = "Solar.Linear.ListArrowUpMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M11 11L3 11"),
                IconPath("M12 16H3"),
                IconPath("M15 11.5L17.5 9M17.5 9L20 11.5M17.5 9V17"),
            ),
        )
        return _listArrowUpMinimalistic!!
    }

private var _listArrowUpMinimalistic: SolarIcon? = null
