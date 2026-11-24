package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SquareArrowRight: SolarIcon
    get() {
        if (_squareArrowRight != null) return _squareArrowRight!!
        _squareArrowRight = SolarIcon(
            name = "Solar.Broken.SquareArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 12C12.6863 12 11.3137 12 16 12M16 12L13 9M16 12L13 15"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _squareArrowRight!!
    }

private var _squareArrowRight: SolarIcon? = null
