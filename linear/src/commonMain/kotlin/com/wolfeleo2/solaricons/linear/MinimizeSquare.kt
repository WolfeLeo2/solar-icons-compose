package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MinimizeSquare: SolarIcon
    get() {
        if (_minimizeSquare != null) return _minimizeSquare!!
        _minimizeSquare = SolarIcon(
            name = "Solar.Linear.MinimizeSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 4L14 10M14 10H17.75M14 10V6.25"),
                IconPath("M4 20L10 14M10 14H6.25M10 14V17.75"),
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
        )
        return _minimizeSquare!!
    }

private var _minimizeSquare: SolarIcon? = null
