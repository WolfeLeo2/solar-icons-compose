package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RadioMinimalistic: SolarIcon
    get() {
        if (_radioMinimalistic != null) return _radioMinimalistic!!
        _radioMinimalistic = SolarIcon(
            name = "Solar.Broken.RadioMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 14C22 17.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14C2 10.2288 2 8.34315 3.17157 7.17157C4.34315 6 6.22876 6 10 6H14C17.7712 6 19.6569 6 20.8284 7.17157C21.4816 7.82475 21.7706 8.69989 21.8985 10"),
                IconPath("M8.0 11.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M13.5 11H19"),
                IconPath("M13.5 14H14M19 14H16.5"),
                IconPath("M16 17H13.5M19 17H18.5"),
                IconPath("M6.5 6L15 2"),
            ),
        )
        return _radioMinimalistic!!
    }

private var _radioMinimalistic: SolarIcon? = null
