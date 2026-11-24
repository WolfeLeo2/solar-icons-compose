package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BatteryHalfMinimalistic: SolarIcon
    get() {
        if (_batteryHalfMinimalistic != null) return _batteryHalfMinimalistic!!
        _batteryHalfMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.BatteryHalfMinimalistic",
            secondaryPaths = listOf(
                IconPath("M2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H11.5C15.2712 4 17.1569 4 18.3284 5.17157C19.5 6.34315 19.5 8.22876 19.5 12C19.5 15.7712 19.5 17.6569 18.3284 18.8284C17.1569 20 15.2712 20 11.5 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M7 9C7 9 7.5 9.9 7.5 12C7.5 14.1 7 15 7 15"),
                IconPath("M10.5 9C10.5 9 11 9.9 11 12C11 14.1 10.5 15 10.5 15"),
                IconPath("M22 14L22 10"),
            ),
        )
        return _batteryHalfMinimalistic!!
    }

private var _batteryHalfMinimalistic: SolarIcon? = null
