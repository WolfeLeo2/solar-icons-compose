package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListCrossMinimalistic: SolarIcon
    get() {
        if (_listCrossMinimalistic != null) return _listCrossMinimalistic!!
        _listCrossMinimalistic = SolarIcon(
            name = "Solar.Broken.ListCrossMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M11 16H3"),
                IconPath("M15 16L20 11M20 16L15 11"),
                IconPath("M11 11L7 11M3 11H4.2"),
            ),
        )
        return _listCrossMinimalistic!!
    }

private var _listCrossMinimalistic: SolarIcon? = null
