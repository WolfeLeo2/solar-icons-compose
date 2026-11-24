package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TransferHorizontal: SolarIcon
    get() {
        if (_transferHorizontal != null) return _transferHorizontal!!
        _transferHorizontal = SolarIcon(
            name = "Solar.Linear.TransferHorizontal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 10L4 10L9.5 4"),
                IconPath("M4 14L20 14L14.5 20"),
            ),
        )
        return _transferHorizontal!!
    }

private var _transferHorizontal: SolarIcon? = null
