package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Stop: SolarIcon
    get() {
        if (_stop != null) return _stop!!
        _stop = SolarIcon(
            name = "Solar.BoldDuotone.Stop",
            secondaryPaths = listOf(
                IconPath("M3.46484 20.5359C4.92931 22.0004 7.28633 22.0004 12.0004 22.0004C16.7144 22.0004 19.0714 22.0004 20.5359 20.5359C22.0004 19.0714 22.0004 16.7144 22.0004 12.0004C22.0004 7.28633 22.0004 4.92931 20.5359 3.46484L3.46484 20.5359Z"),
            ),
            primaryPaths = listOf(
                IconPath("M3.46447 3.46447C2 4.92893 2 7.28595 2 12C2 16.714 2 19.0711 3.46447 20.5355L20.5355 3.46447C19.0711 2 16.714 2 12 2C7.28595 2 4.92893 2 3.46447 3.46447Z", PathFillType.EvenOdd),
            ),
        )
        return _stop!!
    }

private var _stop: SolarIcon? = null
