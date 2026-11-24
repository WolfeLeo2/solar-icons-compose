package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Gps: SolarIcon
    get() {
        if (_gps != null) return _gps!!
        _gps = SolarIcon(
            name = "Solar.LineDuotone.Gps",
            secondaryPaths = listOf(
                IconPath("M15 12C15 13.6569 13.6569 15 12 15C10.3431 15 9 13.6569 9 12C9 10.3431 10.3431 9 12 9C13.6569 9 15 10.3431 15 12Z"),
                IconPath("M2 12L4 12"),
                IconPath("M20 12L22 12"),
                IconPath("M12 4V2"),
                IconPath("M12 22V20"),
            ),
            primaryPaths = listOf(
                IconPath("M20 12C20 16.4183 16.4183 20 12 20C7.58172 20 4 16.4183 4 12C4 7.58172 7.58172 4 12 4C16.4183 4 20 7.58172 20 12Z"),
            ),
        )
        return _gps!!
    }

private var _gps: SolarIcon? = null
