package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MaximizeSquareMinimalistic: SolarIcon
    get() {
        if (_maximizeSquareMinimalistic != null) return _maximizeSquareMinimalistic!!
        _maximizeSquareMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.MaximizeSquareMinimalistic",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M17 7H14M17 7V10M17 7L13.5 10.5M7 17H10M7 17V14M7 17L10.5 13.5"),
            ),
        )
        return _maximizeSquareMinimalistic!!
    }

private var _maximizeSquareMinimalistic: SolarIcon? = null
