package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Notebook: SolarIcon
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = SolarIcon(
            name = "Solar.Linear.Notebook",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 8C3 5.17157 3 3.75736 3.87868 2.87868C4.75736 2 6.17157 2 9 2H15C17.8284 2 19.2426 2 20.1213 2.87868C21 3.75736 21 5.17157 21 8V16C21 18.8284 21 20.2426 20.1213 21.1213C19.2426 22 17.8284 22 15 22H9C6.17157 22 4.75736 22 3.87868 21.1213C3 20.2426 3 18.8284 3 16V8Z"),
                IconPath("M8 2.5V22"),
                IconPath("M2 12H4"),
                IconPath("M2 16H4"),
                IconPath("M2 8H4"),
                IconPath("M11.5 6.5H16.5"),
                IconPath("M11.5 10H16.5"),
            ),
        )
        return _notebook!!
    }

private var _notebook: SolarIcon? = null
