package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.HamburgerMenu: SolarIcon
    get() {
        if (_hamburgerMenu != null) return _hamburgerMenu!!
        _hamburgerMenu = SolarIcon(
            name = "Solar.Linear.HamburgerMenu",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 7L4 7"),
                IconPath("M20 12L4 12"),
                IconPath("M20 17L4 17"),
            ),
        )
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: SolarIcon? = null
