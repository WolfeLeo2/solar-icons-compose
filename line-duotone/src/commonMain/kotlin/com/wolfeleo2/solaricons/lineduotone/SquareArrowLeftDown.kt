package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareArrowLeftDown: SolarIcon
    get() {
        if (_squareArrowLeftDown != null) return _squareArrowLeftDown!!
        _squareArrowLeftDown = SolarIcon(
            name = "Solar.LineDuotone.SquareArrowLeftDown",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 9L9 15M9 15L9 10.5M9 15L13.5 15"),
            ),
        )
        return _squareArrowLeftDown!!
    }

private var _squareArrowLeftDown: SolarIcon? = null
