package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Maximize: SolarIcon
    get() {
        if (_maximize != null) return _maximize!!
        _maximize = SolarIcon(
            name = "Solar.Linear.Maximize",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 15L2 22M2 22H7.85714M2 22V16.1429"),
                IconPath("M15 9L22 2M22 2H16.1429M22 2V7.85714"),
            ),
        )
        return _maximize!!
    }

private var _maximize: SolarIcon? = null
