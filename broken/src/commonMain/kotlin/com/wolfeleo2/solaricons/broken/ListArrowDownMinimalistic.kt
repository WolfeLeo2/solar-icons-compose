package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListArrowDownMinimalistic: SolarIcon
    get() {
        if (_listArrowDownMinimalistic != null) return _listArrowDownMinimalistic!!
        _listArrowDownMinimalistic = SolarIcon(
            name = "Solar.Broken.ListArrowDownMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 16L3 16"),
                IconPath("M12 11L3 11"),
                IconPath("M15 14.5L17.5 17M17.5 17L20 14.5M17.5 17V9"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
            ),
        )
        return _listArrowDownMinimalistic!!
    }

private var _listArrowDownMinimalistic: SolarIcon? = null
