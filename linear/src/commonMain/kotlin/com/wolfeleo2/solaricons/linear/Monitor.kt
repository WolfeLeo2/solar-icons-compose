package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Monitor: SolarIcon
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = SolarIcon(
            name = "Solar.Linear.Monitor",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 10C2 6.22876 2 4.34315 3.17157 3.17157C4.34315 2 6.22876 2 10 2H14C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10V11C22 13.8284 22 15.2426 21.1213 16.1213C20.2426 17 18.8284 17 16 17H8C5.17157 17 3.75736 17 2.87868 16.1213C2 15.2426 2 13.8284 2 11V10Z"),
                IconPath("M16 22H8"),
                IconPath("M12 17L12 22"),
                IconPath("M22 13H2"),
            ),
        )
        return _monitor!!
    }

private var _monitor: SolarIcon? = null
