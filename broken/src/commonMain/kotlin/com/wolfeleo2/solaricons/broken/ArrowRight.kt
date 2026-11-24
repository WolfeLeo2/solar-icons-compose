package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowRight: SolarIcon
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = SolarIcon(
            name = "Solar.Broken.ArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 12H6.5M20 12L14 6M20 12L14 18M20 12H9.5"),
            ),
        )
        return _arrowRight!!
    }

private var _arrowRight: SolarIcon? = null
