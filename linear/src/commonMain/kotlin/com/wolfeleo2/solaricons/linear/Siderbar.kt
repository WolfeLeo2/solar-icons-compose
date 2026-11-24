package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Siderbar: SolarIcon
    get() {
        if (_siderbar != null) return _siderbar!!
        _siderbar = SolarIcon(
            name = "Solar.Linear.Siderbar",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 11C2 7.22876 2 5.34315 3.17157 4.17157C4.34315 3 6.22876 3 10 3H14C17.7712 3 19.6569 3 20.8284 4.17157C22 5.34315 22 7.22876 22 11V13C22 16.7712 22 18.6569 20.8284 19.8284C19.6569 21 17.7712 21 14 21H10C6.22876 21 4.34315 21 3.17157 19.8284C2 18.6569 2 16.7712 2 13V11Z"),
                IconPath("M5.5 10H11.5"),
                IconPath("M6.5 14H10.5"),
                IconPath("M15 21L15 3"),
            ),
        )
        return _siderbar!!
    }

private var _siderbar: SolarIcon? = null
