package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Logout: SolarIcon
    get() {
        if (_logout != null) return _logout!!
        _logout = SolarIcon(
            name = "Solar.Broken.Logout",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 12H20M20 12L17 9M20 12L17 15"),
                IconPath("M4 12C4 7.58172 7.58172 4 12 4M12 20C9.47362 20 7.22075 18.8289 5.75463 17"),
            ),
        )
        return _logout!!
    }

private var _logout: SolarIcon? = null
