package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListUpMinimalistic: SolarIcon
    get() {
        if (_listUpMinimalistic != null) return _listUpMinimalistic!!
        _listUpMinimalistic = SolarIcon(
            name = "Solar.Broken.ListUpMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 11L3 11"),
                IconPath("M11 16H3"),
                IconPath("M14 18L17.5 15L21 18"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
            ),
        )
        return _listUpMinimalistic!!
    }

private var _listUpMinimalistic: SolarIcon? = null
