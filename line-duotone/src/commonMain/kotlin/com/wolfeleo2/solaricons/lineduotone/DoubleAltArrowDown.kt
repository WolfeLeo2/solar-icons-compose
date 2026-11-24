package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DoubleAltArrowDown: SolarIcon
    get() {
        if (_doubleAltArrowDown != null) return _doubleAltArrowDown!!
        _doubleAltArrowDown = SolarIcon(
            name = "Solar.LineDuotone.DoubleAltArrowDown",
            secondaryPaths = listOf(
                IconPath("M19 7L12 13L5 7"),
            ),
            primaryPaths = listOf(
                IconPath("M19 11L12 17L5 11"),
            ),
        )
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: SolarIcon? = null
