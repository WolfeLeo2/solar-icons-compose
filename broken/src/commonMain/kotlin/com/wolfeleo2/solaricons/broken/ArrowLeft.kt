package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowLeft: SolarIcon
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = SolarIcon(
            name = "Solar.Broken.ArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 12L10 6M4 12L10 18M4 12H14.5M20 12H17.5"),
            ),
        )
        return _arrowLeft!!
    }

private var _arrowLeft: SolarIcon? = null
