package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SendSquare: SolarIcon
    get() {
        if (_sendSquare != null) return _sendSquare!!
        _sendSquare = SolarIcon(
            name = "Solar.Linear.SendSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 12L10 12M10 12L13 15M10 12L13 9"),
                IconPath("M7 16L7 8"),
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
        )
        return _sendSquare!!
    }

private var _sendSquare: SolarIcon? = null
