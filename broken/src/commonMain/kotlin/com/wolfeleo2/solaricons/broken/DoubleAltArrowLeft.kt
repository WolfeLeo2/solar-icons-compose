package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.DoubleAltArrowLeft: SolarIcon
    get() {
        if (_doubleAltArrowLeft != null) return _doubleAltArrowLeft!!
        _doubleAltArrowLeft = SolarIcon(
            name = "Solar.Broken.DoubleAltArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 19L7 12L8.5 10.25M13 5L11 7.33333"),
                IconPath("M17 5L11 12L12.5 13.75M17 19L15 16.6667"),
            ),
        )
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: SolarIcon? = null
