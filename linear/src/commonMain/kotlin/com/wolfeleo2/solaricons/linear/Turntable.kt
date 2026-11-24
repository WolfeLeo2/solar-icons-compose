package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Turntable: SolarIcon
    get() {
        if (_turntable != null) return _turntable!!
        _turntable = SolarIcon(
            name = "Solar.Linear.Turntable",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.17157 3.46447C4.34315 2 6.22876 2 10 2H14C17.7712 2 19.6569 2 20.8284 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.8284 20.5355C19.6569 22 17.7712 22 14 22H10C6.22876 22 4.34315 22 3.17157 20.5355C2 19.0711 2 16.714 2 12Z"),
                IconPath("M15 17L15.8944 16.5528C16.572 16.214 17 15.5215 17 14.7639V10.5"),
                IconPath("M15.5 9C15.5 8.17157 16.1716 7.5 17 7.5C17.8284 7.5 18.5 8.17157 18.5 9C18.5 9.82843 17.8284 10.5 17 10.5C16.1716 10.5 15.5 9.82843 15.5 9Z"),
            ),
        )
        return _turntable!!
    }

private var _turntable: SolarIcon? = null
