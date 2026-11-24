package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareTopUp: SolarIcon
    get() {
        if (_squareTopUp != null) return _squareTopUp!!
        _squareTopUp = SolarIcon(
            name = "Solar.LineDuotone.SquareTopUp",
            secondaryPaths = listOf(
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2"),
            ),
            primaryPaths = listOf(
                IconPath("M21 3L12 12M12 12H17.3438M12 12V6.65625"),
            ),
        )
        return _squareTopUp!!
    }

private var _squareTopUp: SolarIcon? = null
