package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CircleTopUp: SolarIcon
    get() {
        if (_circleTopUp != null) return _circleTopUp!!
        _circleTopUp = SolarIcon(
            name = "Solar.Linear.CircleTopUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375"),
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12"),
            ),
        )
        return _circleTopUp!!
    }

private var _circleTopUp: SolarIcon? = null
