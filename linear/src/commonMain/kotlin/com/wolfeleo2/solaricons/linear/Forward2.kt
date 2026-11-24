package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Forward2: SolarIcon
    get() {
        if (_forward2 != null) return _forward2!!
        _forward2 = SolarIcon(
            name = "Solar.Linear.Forward2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19.5 12L14.5 17M19.5 12L14.5 7M19.5 12L9.5 12C7.83333 12 4.5 11 4.5 7"),
            ),
        )
        return _forward2!!
    }

private var _forward2: SolarIcon? = null
