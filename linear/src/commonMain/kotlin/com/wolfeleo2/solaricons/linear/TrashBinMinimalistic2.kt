package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TrashBinMinimalistic2: SolarIcon
    get() {
        if (_trashBinMinimalistic2 != null) return _trashBinMinimalistic2!!
        _trashBinMinimalistic2 = SolarIcon(
            name = "Solar.Linear.TrashBinMinimalistic2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20.5 6H3.49994"),
                IconPath("M18.8334 8.5L18.3734 15.3991C18.1964 18.054 18.1079 19.3815 17.2429 20.1907C16.3779 21 15.0475 21 12.3867 21H11.6133C8.95254 21 7.62214 21 6.75713 20.1907C5.89212 19.3815 5.80362 18.054 5.62663 15.3991L5.16669 8.5"),
                IconPath("M9.17065 4C9.58249 2.83481 10.6937 2 11.9999 2C13.3062 2 14.4174 2.83481 14.8292 4"),
            ),
        )
        return _trashBinMinimalistic2!!
    }

private var _trashBinMinimalistic2: SolarIcon? = null
