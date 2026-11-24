package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowRight: SolarIcon
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = SolarIcon(
            name = "Solar.Linear.ArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 12H20M20 12L14 6M20 12L14 18"),
            ),
        )
        return _arrowRight!!
    }

private var _arrowRight: SolarIcon? = null
