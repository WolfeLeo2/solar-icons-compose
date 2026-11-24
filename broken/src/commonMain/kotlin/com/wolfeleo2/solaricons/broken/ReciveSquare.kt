package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ReciveSquare: SolarIcon
    get() {
        if (_reciveSquare != null) return _reciveSquare!!
        _reciveSquare = SolarIcon(
            name = "Solar.Broken.ReciveSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 12L14 12M14 12L11 15M14 12L11 9"),
                IconPath("M17 16L17 8"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _reciveSquare!!
    }

private var _reciveSquare: SolarIcon? = null
