package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.BedsideTable2: SolarIcon
    get() {
        if (_bedsideTable2 != null) return _bedsideTable2!!
        _bedsideTable2 = SolarIcon(
            name = "Solar.Linear.BedsideTable2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 22V20.5M5 22V20.5"),
                IconPath("M13 17C13 17.5523 12.5523 18 12 18C11.4477 18 11 17.5523 11 17C11 16.4477 11.4477 16 12 16C12.5523 16 13 16.4477 13 17Z"),
                IconPath("M2 10C2 6.22876 2 4.34315 3.17157 3.17157C4.34315 2 6.22876 2 10 2H14C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10V12C22 15.7712 22 17.6569 20.8284 18.8284C19.6569 20 17.7712 20 14 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12V10Z"),
                IconPath("M2 14H22"),
                IconPath("M2 8H22"),
            ),
        )
        return _bedsideTable2!!
    }

private var _bedsideTable2: SolarIcon? = null
