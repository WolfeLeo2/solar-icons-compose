package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ReciveTwiceSquare: SolarIcon
    get() {
        if (_reciveTwiceSquare != null) return _reciveTwiceSquare!!
        _reciveTwiceSquare = SolarIcon(
            name = "Solar.Broken.ReciveTwiceSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 15.5L14 15.5M14 15.5L11 13M14 15.5L11 18"),
                IconPath("M7 8.5L14 8.5M14 8.5L11 6M14 8.5L11 11"),
                IconPath("M17 6L17 18"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _reciveTwiceSquare!!
    }

private var _reciveTwiceSquare: SolarIcon? = null
