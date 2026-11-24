package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SafeSquare: SolarIcon
    get() {
        if (_safeSquare != null) return _safeSquare!!
        _safeSquare = SolarIcon(
            name = "Solar.LineDuotone.SafeSquare",
            secondaryPaths = listOf(
                IconPath("M6 7L6 17"),
                IconPath("M16.5 9.5L18 8"),
                IconPath("M10 16L11.5 14.5"),
                IconPath("M11.5 9.5L10 8"),
                IconPath("M18 16L16.5 14.5"),
            ),
            primaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
                IconPath("M11 12C11 10.3431 12.3431 9 14 9C15.6569 9 17 10.3431 17 12C17 13.6569 15.6569 15 14 15C12.3431 15 11 13.6569 11 12Z"),
            ),
        )
        return _safeSquare!!
    }

private var _safeSquare: SolarIcon? = null
