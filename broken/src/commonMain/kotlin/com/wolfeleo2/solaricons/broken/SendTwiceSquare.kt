package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SendTwiceSquare: SolarIcon
    get() {
        if (_sendTwiceSquare != null) return _sendTwiceSquare!!
        _sendTwiceSquare = SolarIcon(
            name = "Solar.Broken.SendTwiceSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 15.5L10 15.5M10 15.5L13 13M10 15.5L13 18"),
                IconPath("M17 8.5L10 8.5M10 8.5L13 6M10 8.5L13 11"),
                IconPath("M7 6L7 18"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _sendTwiceSquare!!
    }

private var _sendTwiceSquare: SolarIcon? = null
