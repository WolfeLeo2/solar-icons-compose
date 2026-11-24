package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CircleTopDown: SolarIcon
    get() {
        if (_circleTopDown != null) return _circleTopDown!!
        _circleTopDown = SolarIcon(
            name = "Solar.Linear.CircleTopDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 3L12 12M12 12H17.3438M12 12V6.65625"),
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12"),
            ),
        )
        return _circleTopDown!!
    }

private var _circleTopDown: SolarIcon? = null
