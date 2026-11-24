package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BatteryChargeMinimalistic: SolarIcon
    get() {
        if (_batteryChargeMinimalistic != null) return _batteryChargeMinimalistic!!
        _batteryChargeMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.BatteryChargeMinimalistic",
            secondaryPaths = listOf(
                IconPath("M2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H11.5C15.2712 4 17.1569 4 18.3284 5.17157C19.5 6.34315 19.5 8.22876 19.5 12C19.5 15.7712 19.5 17.6569 18.3284 18.8284C17.1569 20 15.2712 20 11.5 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M22 14L22 10"),
                IconPath("M11.5 9L9 12H12.5L10 15"),
            ),
        )
        return _batteryChargeMinimalistic!!
    }

private var _batteryChargeMinimalistic: SolarIcon? = null
