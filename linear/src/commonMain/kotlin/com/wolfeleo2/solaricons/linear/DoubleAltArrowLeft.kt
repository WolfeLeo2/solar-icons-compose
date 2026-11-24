package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.DoubleAltArrowLeft: SolarIcon
    get() {
        if (_doubleAltArrowLeft != null) return _doubleAltArrowLeft!!
        _doubleAltArrowLeft = SolarIcon(
            name = "Solar.Linear.DoubleAltArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.9999 19L6.99991 12L12.9999 5"),
                IconPath("M16.9998 19L10.9998 12L16.9998 5"),
            ),
        )
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: SolarIcon? = null
