package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.FullScreen: SolarIcon
    get() {
        if (_fullScreen != null) return _fullScreen!!
        _fullScreen = SolarIcon(
            name = "Solar.LineDuotone.FullScreen",
            secondaryPaths = listOf(
                IconPath("M22 14C22 17.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22"),
                IconPath("M10 2C6.22876 2 4.34315 2 3.17157 3.17157C2 4.34315 2 6.22876 2 10"),
            ),
            primaryPaths = listOf(
                IconPath("M10 22C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14"),
                IconPath("M14 2C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10"),
            ),
        )
        return _fullScreen!!
    }

private var _fullScreen: SolarIcon? = null
