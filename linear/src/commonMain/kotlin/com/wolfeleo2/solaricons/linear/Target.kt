package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Target: SolarIcon
    get() {
        if (_target != null) return _target!!
        _target = SolarIcon(
            name = "Solar.Linear.Target",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12Z"),
                IconPath("M2 12L5 12"),
                IconPath("M19 12L22 12"),
                IconPath("M12 22L12 19"),
                IconPath("M12 5L12 2"),
                IconPath("M10 12H12H14"),
                IconPath("M12 14L12 12L12 10"),
            ),
        )
        return _target!!
    }

private var _target: SolarIcon? = null
