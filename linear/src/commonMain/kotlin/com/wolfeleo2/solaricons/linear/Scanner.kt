package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Scanner: SolarIcon
    get() {
        if (_scanner != null) return _scanner!!
        _scanner = SolarIcon(
            name = "Solar.Linear.Scanner",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 22C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 18.7712 2 15"),
                IconPath("M22 15C22 18.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22"),
                IconPath("M14 2C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 5.22876 22 9"),
                IconPath("M10 2C6.22876 2 4.34315 2 3.17157 3.17157C2 4.34315 2 5.22876 2 9"),
                IconPath("M2 12H22"),
            ),
        )
        return _scanner!!
    }

private var _scanner: SolarIcon? = null
