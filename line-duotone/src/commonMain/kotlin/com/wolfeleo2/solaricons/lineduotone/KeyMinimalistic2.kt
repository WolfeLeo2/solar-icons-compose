package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.KeyMinimalistic2: SolarIcon
    get() {
        if (_keyMinimalistic2 != null) return _keyMinimalistic2!!
        _keyMinimalistic2 = SolarIcon(
            name = "Solar.LineDuotone.KeyMinimalistic2",
            secondaryPaths = listOf(
                IconPath("M15.0 7.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15.0 2.0 a7.0 7.0 0 1 0 0 14.0 a7.0 7.0 0 1 0 0 -14.0z"),
                IconPath("M3.5 20.5L9.5 14.5"),
                IconPath("M6 21L4.5 19.5M6.5 17.5L8 19"),
            ),
        )
        return _keyMinimalistic2!!
    }

private var _keyMinimalistic2: SolarIcon? = null
