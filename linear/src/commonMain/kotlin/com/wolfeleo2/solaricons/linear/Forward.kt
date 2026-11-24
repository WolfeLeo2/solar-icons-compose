package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Forward: SolarIcon
    get() {
        if (_forward != null) return _forward!!
        _forward = SolarIcon(
            name = "Solar.Linear.Forward",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19.5 12L14.5 7M19.5 12L14.5 17M19.5 12L9.5 12C7.83333 12 4.5 13 4.5 17"),
            ),
        )
        return _forward!!
    }

private var _forward: SolarIcon? = null
