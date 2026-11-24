package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.MaximizeSquare2: SolarIcon
    get() {
        if (_maximizeSquare2 != null) return _maximizeSquare2!!
        _maximizeSquare2 = SolarIcon(
            name = "Solar.Broken.MaximizeSquare2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 7H14M17 7V10M17 7L13.5 10.5M7 17H10M7 17V14M7 17L10.5 13.5"),
                IconPath("M7 7H10M7 7V10M7 7L10.5 10.5M17 17H14M17 17V14M17 17L13.5 13.5"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _maximizeSquare2!!
    }

private var _maximizeSquare2: SolarIcon? = null
