package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Tram: SolarIcon
    get() {
        if (_tram != null) return _tram!!
        _tram = SolarIcon(
            name = "Solar.Linear.Tram",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 10C4 6.22876 4 4.34315 5.17157 3.17157C6.34315 2 8.22876 2 12 2C15.7712 2 17.6569 2 18.8284 3.17157C20 4.34315 20 6.22876 20 10V12C20 15.7712 20 17.6569 18.8284 18.8284C17.6569 20 15.7712 20 12 20C8.22876 20 6.34315 20 5.17157 18.8284C4 17.6569 4 15.7712 4 12V10Z"),
                IconPath("M4 13H20"),
                IconPath("M15.5 16H17"),
                IconPath("M7 16H8.5"),
                IconPath("M7 20L6 22"),
                IconPath("M17 20L18 22"),
                IconPath("M10 2V2.5C10 3.60457 10.8954 4.5 12 4.5C13.1046 4.5 14 3.60457 14 2.5V2"),
            ),
        )
        return _tram!!
    }

private var _tram: SolarIcon? = null
