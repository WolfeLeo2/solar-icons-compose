package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Magnifer: SolarIcon
    get() {
        if (_magnifer != null) return _magnifer!!
        _magnifer = SolarIcon(
            name = "Solar.Linear.Magnifer",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5 2.0 a9.5 9.5 0 1 0 0 19.0 a9.5 9.5 0 1 0 0 -19.0z"),
                IconPath("M18.5 18.5L22 22"),
            ),
        )
        return _magnifer!!
    }

private var _magnifer: SolarIcon? = null
