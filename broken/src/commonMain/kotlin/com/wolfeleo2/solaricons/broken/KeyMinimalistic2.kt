package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.KeyMinimalistic2: SolarIcon
    get() {
        if (_keyMinimalistic2 != null) return _keyMinimalistic2!!
        _keyMinimalistic2 = SolarIcon(
            name = "Solar.Broken.KeyMinimalistic2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21.0635 12.5C21.6591 11.4704 22 10.275 22 9C22 5.13401 18.866 2 15 2C11.134 2 8 5.13401 8 9C8 12.866 11.134 16 15 16C16.0736 16 17.0907 15.7583 18 15.3264"),
                IconPath("M15.0 7.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M3.5 20.5L9.5 14.5"),
                IconPath("M6 21L4.5 19.5M6.5 17.5L8 19"),
            ),
        )
        return _keyMinimalistic2!!
    }

private var _keyMinimalistic2: SolarIcon? = null
