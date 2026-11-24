package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MinimalisticMagnifer: SolarIcon
    get() {
        if (_minimalisticMagnifer != null) return _minimalisticMagnifer!!
        _minimalisticMagnifer = SolarIcon(
            name = "Solar.Linear.MinimalisticMagnifer",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5 2.0 a9.5 9.5 0 1 0 0 19.0 a9.5 9.5 0 1 0 0 -19.0z"),
                IconPath("M20 20L22 22"),
            ),
        )
        return _minimalisticMagnifer!!
    }

private var _minimalisticMagnifer: SolarIcon? = null
