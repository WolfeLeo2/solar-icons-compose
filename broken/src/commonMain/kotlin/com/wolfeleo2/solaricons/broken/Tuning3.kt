package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Tuning3: SolarIcon
    get() {
        if (_tuning3 != null) return _tuning3!!
        _tuning3 = SolarIcon(
            name = "Solar.Broken.Tuning3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M20.0 12.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M0.0 -2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M4 12L4 14.75M4 19L4 17.5"),
                IconPath("M20 12L20 9.25M20 5L20 6.5"),
                IconPath("M12 19L12 14"),
                IconPath("M20 19L20 16"),
                IconPath("M4 5L4 7.66667"),
                IconPath("M12 10V7.5M12 5V5.5"),
            ),
        )
        return _tuning3!!
    }

private var _tuning3: SolarIcon? = null
