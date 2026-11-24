package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TransferHorizontal: SolarIcon
    get() {
        if (_transferHorizontal != null) return _transferHorizontal!!
        _transferHorizontal = SolarIcon(
            name = "Solar.Broken.TransferHorizontal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9.5 4L4 10L14 10M20 10L17.5 10"),
                IconPath("M14.5 20L20 14L10 14M4 14L6.5 14"),
            ),
        )
        return _transferHorizontal!!
    }

private var _transferHorizontal: SolarIcon? = null
