package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListUpMinimalistic: SolarIcon
    get() {
        if (_listUpMinimalistic != null) return _listUpMinimalistic!!
        _listUpMinimalistic = SolarIcon(
            name = "Solar.Linear.ListUpMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 6L3 6"),
                IconPath("M20 11L3 11"),
                IconPath("M11 16H3"),
                IconPath("M14 18L17.5 15L21 18"),
            ),
        )
        return _listUpMinimalistic!!
    }

private var _listUpMinimalistic: SolarIcon? = null
