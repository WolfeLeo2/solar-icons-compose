package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowLeft: SolarIcon
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = SolarIcon(
            name = "Solar.Linear.ArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 12H4M4 12L10 6M4 12L10 18"),
            ),
        )
        return _arrowLeft!!
    }

private var _arrowLeft: SolarIcon? = null
