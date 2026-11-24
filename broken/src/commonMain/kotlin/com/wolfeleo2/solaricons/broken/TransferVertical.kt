package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TransferVertical: SolarIcon
    get() {
        if (_transferVertical != null) return _transferVertical!!
        _transferVertical = SolarIcon(
            name = "Solar.Broken.TransferVertical",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 20L14 17.5M20 9.5L14 4V14"),
                IconPath("M4 14.5L10 20V10M10 4L10 6.5"),
            ),
        )
        return _transferVertical!!
    }

private var _transferVertical: SolarIcon? = null
