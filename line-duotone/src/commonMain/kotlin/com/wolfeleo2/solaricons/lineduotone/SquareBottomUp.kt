package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareBottomUp: SolarIcon
    get() {
        if (_squareBottomUp != null) return _squareBottomUp!!
        _squareBottomUp = SolarIcon(
            name = "Solar.LineDuotone.SquareBottomUp",
            secondaryPaths = listOf(
                IconPath("M12.9999 21.9994C17.055 21.9921 19.1784 21.8926 20.5354 20.5355C21.9999 19.0711 21.9999 16.714 21.9999 12C21.9999 7.28595 21.9999 4.92893 20.5354 3.46447C19.071 2 16.714 2 11.9999 2C7.28587 2 4.92884 2 3.46438 3.46447C2.10734 4.8215 2.00779 6.94493 2.00049 11"),
            ),
            primaryPaths = listOf(
                IconPath("M3 21L11 13M11 13H5M11 13V19"),
            ),
        )
        return _squareBottomUp!!
    }

private var _squareBottomUp: SolarIcon? = null
