package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.DoubleAltArrowRight: SolarIcon
    get() {
        if (_doubleAltArrowRight != null) return _doubleAltArrowRight!!
        _doubleAltArrowRight = SolarIcon(
            name = "Solar.Broken.DoubleAltArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 19L17 12L15.5 10.25M11 5L13 7.33333"),
                IconPath("M7 5L13 12L11.5 13.75M7 19L9 16.6667"),
            ),
        )
        return _doubleAltArrowRight!!
    }

private var _doubleAltArrowRight: SolarIcon? = null
