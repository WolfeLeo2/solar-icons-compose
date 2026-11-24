package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BedsideTable4: SolarIcon
    get() {
        if (_bedsideTable4 != null) return _bedsideTable4!!
        _bedsideTable4 = SolarIcon(
            name = "Solar.LineDuotone.BedsideTable4",
            secondaryPaths = listOf(
                IconPath("M19 22V20.5M5 22V20.5"),
                IconPath("M12 20V8M2 8H22"),
            ),
            primaryPaths = listOf(
                IconPath("M15 12V15"),
                IconPath("M9 12V15"),
                IconPath("M2 10C2 6.22876 2 4.34315 3.17157 3.17157C4.34315 2 6.22876 2 10 2H14C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10V12C22 15.7712 22 17.6569 20.8284 18.8284C19.6569 20 17.7712 20 14 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12V10Z"),
            ),
        )
        return _bedsideTable4!!
    }

private var _bedsideTable4: SolarIcon? = null
