package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Logout: SolarIcon
    get() {
        if (_logout != null) return _logout!!
        _logout = SolarIcon(
            name = "Solar.LineDuotone.Logout",
            secondaryPaths = listOf(
                IconPath("M12 20C7.58172 20 4 16.4183 4 12C4 7.58172 7.58172 4 12 4"),
            ),
            primaryPaths = listOf(
                IconPath("M10 12H20M20 12L17 9M20 12L17 15"),
            ),
        )
        return _logout!!
    }

private var _logout: SolarIcon? = null
