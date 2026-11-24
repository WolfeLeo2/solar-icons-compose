package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Gps: SolarIcon
    get() {
        if (_gps != null) return _gps!!
        _gps = SolarIcon(
            name = "Solar.Broken.Gps",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.5 14.9585C12.3374 14.9858 12.1704 15 12 15C10.3431 15 9 13.6569 9 12C9 10.3431 10.3431 9 12 9C13.6569 9 15 10.3431 15 12C15 12.1704 14.9858 12.3374 14.9585 12.5"),
                IconPath("M2 12L4 12"),
                IconPath("M20 12L22 12"),
                IconPath("M12 4V2"),
                IconPath("M12 22V20"),
                IconPath("M8 5.07026C9.17669 4.38958 10.5429 4 12 4C16.4183 4 20 7.58172 20 12C20 16.4183 16.4183 20 12 20C7.58172 20 4 16.4183 4 12C4 10.5429 4.38958 9.17669 5.07026 8"),
            ),
        )
        return _gps!!
    }

private var _gps: SolarIcon? = null
