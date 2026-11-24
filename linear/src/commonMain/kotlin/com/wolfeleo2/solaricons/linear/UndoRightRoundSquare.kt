package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UndoRightRoundSquare: SolarIcon
    get() {
        if (_undoRightRoundSquare != null) return _undoRightRoundSquare!!
        _undoRightRoundSquare = SolarIcon(
            name = "Solar.Linear.UndoRightRoundSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
                IconPath("M17.5 9.50075H9.96155C8.04979 9.50075 6.5 11.0505 6.5 12.9623C6.5 14.874 8.04978 16.4238 9.96154 16.4238H14.5M17.5 9.50075L15.25 7.42383M17.5 9.50075L15.25 11.5777"),
            ),
        )
        return _undoRightRoundSquare!!
    }

private var _undoRightRoundSquare: SolarIcon? = null
