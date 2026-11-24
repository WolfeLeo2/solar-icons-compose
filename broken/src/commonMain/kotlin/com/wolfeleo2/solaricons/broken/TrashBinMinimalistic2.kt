package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TrashBinMinimalistic2: SolarIcon
    get() {
        if (_trashBinMinimalistic2 != null) return _trashBinMinimalistic2!!
        _trashBinMinimalistic2 = SolarIcon(
            name = "Solar.Broken.TrashBinMinimalistic2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20.5001 6H3.5"),
                IconPath("M9.17065 4C9.58249 2.83481 10.6937 2 11.9999 2C13.3062 2 14.4174 2.83481 14.8292 4"),
                IconPath("M18.3735 15.3991C18.1965 18.054 18.108 19.3815 17.243 20.1907C16.378 21 15.0476 21 12.3868 21H11.6134C8.9526 21 7.6222 21 6.75719 20.1907C5.89218 19.3815 5.80368 18.054 5.62669 15.3991L5.16675 8.5M18.8334 8.5L18.6334 11.5"),
            ),
        )
        return _trashBinMinimalistic2!!
    }

private var _trashBinMinimalistic2: SolarIcon? = null
