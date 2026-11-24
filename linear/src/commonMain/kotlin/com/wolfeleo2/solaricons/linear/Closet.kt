package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Closet: SolarIcon
    get() {
        if (_closet != null) return _closet!!
        _closet = SolarIcon(
            name = "Solar.Linear.Closet",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 22V21.5M5 22V21.5"),
                IconPath("M12 21V2"),
                IconPath("M15 8V10"),
                IconPath("M2 10C2 6.22876 2 4.34315 3.17157 3.17157C4.34315 2 6.22876 2 10 2H14C17.7712 2 19.6569 2 20.8284 3.17157C22 4.34315 22 6.22876 22 10V13C22 16.7712 22 18.6569 20.8284 19.8284C19.6569 21 17.7712 21 14 21H10C6.22876 21 4.34315 21 3.17157 19.8284C2 18.6569 2 16.7712 2 13V10Z"),
                IconPath("M2 8H12"),
                IconPath("M2 15H22"),
                IconPath("M15 18L17 18"),
                IconPath("M7 18L9 18"),
            ),
        )
        return _closet!!
    }

private var _closet: SolarIcon? = null
