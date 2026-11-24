package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BombMinimalistic: SolarIcon
    get() {
        if (_bombMinimalistic != null) return _bombMinimalistic!!
        _bombMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.BombMinimalistic",
            secondaryPaths = listOf(
                IconPath("M17 7L15 9"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 7.0 a7.5 7.5 0 1 0 0 15.0 a7.5 7.5 0 1 0 0 -15.0z"),
                IconPath("M19.5 7.5L20.5 8"),
                IconPath("M16 3.5L16.5 4.5"),
                IconPath("M19 5L20 4"),
            ),
        )
        return _bombMinimalistic!!
    }

private var _bombMinimalistic: SolarIcon? = null
