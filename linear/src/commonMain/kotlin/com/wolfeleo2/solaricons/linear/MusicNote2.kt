package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MusicNote2: SolarIcon
    get() {
        if (_musicNote2 != null) return _musicNote2!!
        _musicNote2 = SolarIcon(
            name = "Solar.Linear.MusicNote2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 18V10V2"),
                IconPath("M9.0 14.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M19 8C15.6863 8 13 5.31371 13 2"),
            ),
        )
        return _musicNote2!!
    }

private var _musicNote2: SolarIcon? = null
