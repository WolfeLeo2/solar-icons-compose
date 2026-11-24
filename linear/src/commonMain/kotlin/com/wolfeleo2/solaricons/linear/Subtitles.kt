package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Subtitles: SolarIcon
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = SolarIcon(
            name = "Solar.Linear.Subtitles",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H14C17.7712 4 19.6569 4 20.8284 5.17157C22 6.34315 22 8.22876 22 12C22 15.7712 22 17.6569 20.8284 18.8284C19.6569 20 17.7712 20 14 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12Z"),
                IconPath("M10 16H6"),
                IconPath("M14 13H18"),
                IconPath("M14 16H12.5"),
                IconPath("M9.5 13H11.5"),
                IconPath("M18 16H16.5"),
                IconPath("M6 13H7"),
            ),
        )
        return _subtitles!!
    }

private var _subtitles: SolarIcon? = null
