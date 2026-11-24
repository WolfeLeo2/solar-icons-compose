package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CircleTopUp: SolarIcon
    get() {
        if (_circleTopUp != null) return _circleTopUp!!
        _circleTopUp = SolarIcon(
            name = "Solar.LineDuotone.CircleTopUp",
            secondaryPaths = listOf(
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12"),
            ),
            primaryPaths = listOf(
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375"),
            ),
        )
        return _circleTopUp!!
    }

private var _circleTopUp: SolarIcon? = null
