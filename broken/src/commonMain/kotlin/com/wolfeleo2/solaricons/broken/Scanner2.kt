package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Scanner2: SolarIcon
    get() {
        if (_scanner2 != null) return _scanner2!!
        _scanner2 = SolarIcon(
            name = "Solar.Broken.Scanner2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 13C6 13 7.8 11 12 11C16.2 11 18 13 18 13"),
                IconPath("M10 22C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14"),
                IconPath("M14 2C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10"),
                IconPath("M22 14C22 14.3492 22 14.6822 21.9991 15M14 22C17.7712 22 19.6569 22 20.8284 20.8284C21.4816 20.1752 21.7706 19.3001 21.8985 18"),
                IconPath("M2 10C2 9.65081 2 9.31779 2.00093 9M10 2C6.22876 2 4.34315 2 3.17157 3.17157C2.51839 3.82476 2.22938 4.69989 2.10149 6"),
            ),
        )
        return _scanner2!!
    }

private var _scanner2: SolarIcon? = null
