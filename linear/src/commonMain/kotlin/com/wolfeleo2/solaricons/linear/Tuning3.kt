package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Tuning3: SolarIcon
    get() {
        if (_tuning3 != null) return _tuning3!!
        _tuning3 = SolarIcon(
            name = "Solar.Linear.Tuning3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M20.0 12.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M0.0 -2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M12 8L12 5"),
                IconPath("M20 10L20 5"),
                IconPath("M4 14L4 19"),
                IconPath("M12 19L12 16"),
                IconPath("M20 19L20 18"),
                IconPath("M4 5L4 6"),
            ),
        )
        return _tuning3!!
    }

private var _tuning3: SolarIcon? = null
