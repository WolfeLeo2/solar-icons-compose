package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DoubleAltArrowLeft: SolarIcon
    get() {
        if (_doubleAltArrowLeft != null) return _doubleAltArrowLeft!!
        _doubleAltArrowLeft = SolarIcon(
            name = "Solar.LineDuotone.DoubleAltArrowLeft",
            secondaryPaths = listOf(
                IconPath("M16.9998 19L10.9998 12L16.9998 5"),
            ),
            primaryPaths = listOf(
                IconPath("M12.9999 19L6.99988 12L12.9999 5"),
            ),
        )
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: SolarIcon? = null
