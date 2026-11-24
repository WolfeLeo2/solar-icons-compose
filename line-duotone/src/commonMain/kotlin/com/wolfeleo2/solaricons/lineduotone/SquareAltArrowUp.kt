package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareAltArrowUp: SolarIcon
    get() {
        if (_squareAltArrowUp != null) return _squareAltArrowUp!!
        _squareAltArrowUp = SolarIcon(
            name = "Solar.LineDuotone.SquareAltArrowUp",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 13.5L12 10.5L9 13.5"),
            ),
        )
        return _squareAltArrowUp!!
    }

private var _squareAltArrowUp: SolarIcon? = null
