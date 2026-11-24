package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SquareTopDown: SolarIcon
    get() {
        if (_squareTopDown != null) return _squareTopDown!!
        _squareTopDown = SolarIcon(
            name = "Solar.Linear.SquareTopDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2"),
            ),
        )
        return _squareTopDown!!
    }

private var _squareTopDown: SolarIcon? = null
