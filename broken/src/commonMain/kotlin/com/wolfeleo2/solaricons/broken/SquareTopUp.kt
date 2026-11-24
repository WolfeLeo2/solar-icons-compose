package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SquareTopUp: SolarIcon
    get() {
        if (_squareTopUp != null) return _squareTopUp!!
        _squareTopUp = SolarIcon(
            name = "Solar.Broken.SquareTopUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 3L12 12M12 12H17.3438M12 12V6.65625"),
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2.49073 19.5618 2.16444 18.1934 2.0551 16"),
            ),
        )
        return _squareTopUp!!
    }

private var _squareTopUp: SolarIcon? = null
