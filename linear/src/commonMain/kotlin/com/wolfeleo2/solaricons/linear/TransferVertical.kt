package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TransferVertical: SolarIcon
    get() {
        if (_transferVertical != null) return _transferVertical!!
        _transferVertical = SolarIcon(
            name = "Solar.Linear.TransferVertical",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 4L10 20L4 14.5"),
                IconPath("M14 20L14 4L20 9.5"),
            ),
        )
        return _transferVertical!!
    }

private var _transferVertical: SolarIcon? = null
