package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SquareSortVertical: SolarIcon
    get() {
        if (_squareSortVertical != null) return _squareSortVertical!!
        _squareSortVertical = SolarIcon(
            name = "Solar.LineDuotone.SquareSortVertical",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 8L9.5 16M9.5 16L7 13.25M9.5 16L12 13.25"),
                IconPath("M14.5 16L14.5 8M14.5 8L12 10.75M14.5 8L17 10.75"),
            ),
        )
        return _squareSortVertical!!
    }

private var _squareSortVertical: SolarIcon? = null
