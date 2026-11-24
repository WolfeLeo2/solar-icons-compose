package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Streets: SolarIcon
    get() {
        if (_streets != null) return _streets!!
        _streets = SolarIcon(
            name = "Solar.Broken.Streets",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3.5 20.5L12 12M20.5 3.5L12 12M20.5 20.5L12 12"),
                IconPath("M2 12C2 16.714 2 19.0711 3.46447 20.5355C4.92893 22 7.28595 22 12 22C16.714 22 19.0711 22 20.5355 20.5355C22 19.0711 22 16.714 22 12C22 7.28595 22 4.92893 20.5355 3.46447C19.0711 2 16.714 2 12 2C7.28595 2 4.92893 2 3.46447 3.46447C2.49073 4.43821 2.16444 5.80655 2.0551 8"),
            ),
        )
        return _streets!!
    }

private var _streets: SolarIcon? = null
