package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TransferVertical: SolarIcon
    get() {
        if (_transferVertical != null) return _transferVertical!!
        _transferVertical = SolarIcon(
            name = "Solar.LineDuotone.TransferVertical",
            secondaryPaths = listOf(
                IconPath("M14 20L14 4L20 9.5"),
            ),
            primaryPaths = listOf(
                IconPath("M10 4L10 20L4 14.5"),
            ),
        )
        return _transferVertical!!
    }

private var _transferVertical: SolarIcon? = null
