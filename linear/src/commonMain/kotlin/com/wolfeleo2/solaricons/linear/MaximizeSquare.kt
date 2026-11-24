package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MaximizeSquare: SolarIcon
    get() {
        if (_maximizeSquare != null) return _maximizeSquare!!
        _maximizeSquare = SolarIcon(
            name = "Solar.Linear.MaximizeSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 12L17 7M17 7H13.25M17 7V10.75"),
                IconPath("M12 12L7 17M7 17H10.75M7 17V13.25"),
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
        )
        return _maximizeSquare!!
    }

private var _maximizeSquare: SolarIcon? = null
