package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Streets: SolarIcon
    get() {
        if (_streets != null) return _streets!!
        _streets = SolarIcon(
            name = "Solar.Linear.Streets",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22Z"),
                IconPath("M3.5 20.5L12 12M20.5 3.5L12 12M20.5 20.5L12 12"),
            ),
        )
        return _streets!!
    }

private var _streets: SolarIcon? = null
