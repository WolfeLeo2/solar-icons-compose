package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListDownMinimalistic: SolarIcon
    get() {
        if (_listDownMinimalistic != null) return _listDownMinimalistic!!
        _listDownMinimalistic = SolarIcon(
            name = "Solar.Broken.ListDownMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 16H3"),
                IconPath("M14 15L17.5 18L21 15"),
                IconPath("M20 11L3 11"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
            ),
        )
        return _listDownMinimalistic!!
    }

private var _listDownMinimalistic: SolarIcon? = null
