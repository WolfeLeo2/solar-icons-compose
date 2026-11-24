package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.DoubleAltArrowRight: SolarIcon
    get() {
        if (_doubleAltArrowRight != null) return _doubleAltArrowRight!!
        _doubleAltArrowRight = SolarIcon(
            name = "Solar.Linear.DoubleAltArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 19L17 12L11 5"),
                IconPath("M6.99982 19L12.9998 12L6.99982 5"),
            ),
        )
        return _doubleAltArrowRight!!
    }

private var _doubleAltArrowRight: SolarIcon? = null
