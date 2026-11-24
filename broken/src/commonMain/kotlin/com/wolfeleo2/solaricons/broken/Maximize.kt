package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Maximize: SolarIcon
    get() {
        if (_maximize != null) return _maximize!!
        _maximize = SolarIcon(
            name = "Solar.Broken.Maximize",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 2H16.1429M22 2V7.85714M22 2L18.5 5.5M15 9L15.875 8.125"),
                IconPath("M9 15L2 22M2 22H7.85714M2 22V16.1429"),
            ),
        )
        return _maximize!!
    }

private var _maximize: SolarIcon? = null
