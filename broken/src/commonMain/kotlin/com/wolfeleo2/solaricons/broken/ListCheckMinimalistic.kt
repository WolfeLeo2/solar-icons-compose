package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListCheckMinimalistic: SolarIcon
    get() {
        if (_listCheckMinimalistic != null) return _listCheckMinimalistic!!
        _listCheckMinimalistic = SolarIcon(
            name = "Solar.Broken.ListCheckMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 11L3 11"),
                IconPath("M10 16H3"),
                IconPath("M14 13.5L16.1 16L20 11"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
            ),
        )
        return _listCheckMinimalistic!!
    }

private var _listCheckMinimalistic: SolarIcon? = null
