package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TransferHorizontal: SolarIcon
    get() {
        if (_transferHorizontal != null) return _transferHorizontal!!
        _transferHorizontal = SolarIcon(
            name = "Solar.LineDuotone.TransferHorizontal",
            secondaryPaths = listOf(
                IconPath("M4 14L20 14L14.5 20"),
            ),
            primaryPaths = listOf(
                IconPath("M20 10L4 10L9.5 4"),
            ),
        )
        return _transferHorizontal!!
    }

private var _transferHorizontal: SolarIcon? = null
