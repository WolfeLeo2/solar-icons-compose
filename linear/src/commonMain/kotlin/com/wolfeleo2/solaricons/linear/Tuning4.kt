package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Tuning4: SolarIcon
    get() {
        if (_tuning4 != null) return _tuning4!!
        _tuning4 = SolarIcon(
            name = "Solar.Linear.Tuning4",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M10.0 18.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M0.0 -2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M16 12L19 12"),
                IconPath("M14 20L19 20"),
                IconPath("M10 4L5 4"),
                IconPath("M5 12L8 12"),
                IconPath("M5 20L6 20"),
                IconPath("M19 4L18 4"),
            ),
        )
        return _tuning4!!
    }

private var _tuning4: SolarIcon? = null
