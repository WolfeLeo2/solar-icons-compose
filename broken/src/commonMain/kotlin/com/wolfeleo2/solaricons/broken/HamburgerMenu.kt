package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.HamburgerMenu: SolarIcon
    get() {
        if (_hamburgerMenu != null) return _hamburgerMenu!!
        _hamburgerMenu = SolarIcon(
            name = "Solar.Broken.HamburgerMenu",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 7L7 7M20 7L11 7"),
                IconPath("M20 17H17M4 17L13 17"),
                IconPath("M4 12H7L20 12"),
            ),
        )
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: SolarIcon? = null
