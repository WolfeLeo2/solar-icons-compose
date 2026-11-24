package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Forward: SolarIcon
    get() {
        if (_forward != null) return _forward!!
        _forward = SolarIcon(
            name = "Solar.LineDuotone.Forward",
            secondaryPaths = listOf(
                IconPath("M19.5 12L9.5 12C7.83333 12 4.5 13 4.5 17"),
            ),
            primaryPaths = listOf(
                IconPath("M14.5 7L19.5 12L14.5 17"),
            ),
        )
        return _forward!!
    }

private var _forward: SolarIcon? = null
