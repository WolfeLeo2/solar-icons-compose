package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareBottomDown: SolarIcon
    get() {
        if (_squareBottomDown != null) return _squareBottomDown!!
        _squareBottomDown = SolarIcon(
            name = "Solar.LineDuotone.SquareBottomDown",
            secondaryPaths = listOf(
                IconPath("M13 21.9994C17.0551 21.9921 19.1785 21.8926 20.5356 20.5355C22 19.0711 22 16.714 22 12C22 7.28595 22 4.92893 20.5356 3.46447C19.0711 2 16.7141 2 12 2C7.28599 2 4.92896 2 3.4645 3.46447C2.10747 4.8215 2.00791 6.94493 2.00061 11"),
            ),
            primaryPaths = listOf(
                IconPath("M11 13L3 21M3 21H9M3 21V15"),
            ),
        )
        return _squareBottomDown!!
    }

private var _squareBottomDown: SolarIcon? = null
