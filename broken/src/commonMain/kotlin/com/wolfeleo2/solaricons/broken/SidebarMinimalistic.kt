package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SidebarMinimalistic: SolarIcon
    get() {
        if (_sidebarMinimalistic != null) return _sidebarMinimalistic!!
        _sidebarMinimalistic = SolarIcon(
            name = "Solar.Broken.SidebarMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 3L15 13M15 17L15 21"),
                IconPath("M2 11V13C2 16.7712 2 18.6569 3.17157 19.8284C4.34315 21 6.22876 21 10 21H14C17.7712 21 19.6569 21 20.8284 19.8284C22 18.6569 22 16.7712 22 13V11C22 7.22876 22 5.34315 20.8284 4.17157C19.6569 3 17.7712 3 14 3H10C6.22876 3 4.34315 3 3.17157 4.17157C2.51839 4.82475 2.22937 5.69989 2.10149 7"),
            ),
        )
        return _sidebarMinimalistic!!
    }

private var _sidebarMinimalistic: SolarIcon? = null
