package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.FullScreen: SolarIcon
    get() {
        if (_fullScreen != null) return _fullScreen!!
        _fullScreen = SolarIcon(
            name = "Solar.Broken.FullScreen",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 22C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14"),
                IconPath("M10 2C6.22876 2 4.34315 2 3.17157 3.17157C2.92939 3.41375 2.73727 3.68645 2.58487 4M2 10C2 9.26451 2 8.60074 2.00869 8"),
                IconPath("M14 2C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10"),
                IconPath("M14 22C17.7712 22 19.6569 22 20.8284 20.8284C21.0706 20.5862 21.2627 20.3136 21.4151 20M22 14C22 14.7355 22 15.3993 21.9913 16"),
            ),
        )
        return _fullScreen!!
    }

private var _fullScreen: SolarIcon? = null
