package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DoubleAltArrowUp: SolarIcon
    get() {
        if (_doubleAltArrowUp != null) return _doubleAltArrowUp!!
        _doubleAltArrowUp = SolarIcon(
            name = "Solar.LineDuotone.DoubleAltArrowUp",
            secondaryPaths = listOf(
                IconPath("M19 17L12 11L5 17"),
            ),
            primaryPaths = listOf(
                IconPath("M19 13L12 7L5 13"),
            ),
        )
        return _doubleAltArrowUp!!
    }

private var _doubleAltArrowUp: SolarIcon? = null
