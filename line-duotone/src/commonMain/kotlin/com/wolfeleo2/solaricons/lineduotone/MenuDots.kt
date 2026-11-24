package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MenuDots: SolarIcon
    get() {
        if (_menuDots != null) return _menuDots!!
        _menuDots = SolarIcon(
            name = "Solar.LineDuotone.MenuDots",
            secondaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M5.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M19.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _menuDots!!
    }

private var _menuDots: SolarIcon? = null
