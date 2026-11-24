package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.HamburgerMenu: SolarIcon
    get() {
        if (_hamburgerMenu != null) return _hamburgerMenu!!
        _hamburgerMenu = SolarIcon(
            name = "Solar.LineDuotone.HamburgerMenu",
            secondaryPaths = listOf(
                IconPath("M20 12L4 12"),
            ),
            primaryPaths = listOf(
                IconPath("M20 7L4 7"),
                IconPath("M20 17L4 17"),
            ),
        )
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: SolarIcon? = null
