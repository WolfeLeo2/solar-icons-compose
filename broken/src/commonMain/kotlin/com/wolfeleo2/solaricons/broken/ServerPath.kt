package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ServerPath: SolarIcon
    get() {
        if (_serverPath != null) return _serverPath!!
        _serverPath = SolarIcon(
            name = "Solar.Broken.ServerPath",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 19H14M2 19H10"),
                IconPath("M12 17V14"),
                IconPath("M12.0 17.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M14 14H5C3.34315 14 2 12.6569 2 11C2 9.34315 3.34315 8 5 8H19C20.6569 8 22 9.34315 22 11C22 12.6569 20.6569 14 19 14H18"),
                IconPath("M12 2H19C20.6569 2 22 3.34315 22 5C22 6.65685 20.6569 8 19 8H5C3.34315 8 2 6.65685 2 5C2 3.34315 3.34315 2 5 2H8"),
                IconPath("M13 5L19 5"),
                IconPath("M13 11L19 11"),
                IconPath("M6.0 4.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
                IconPath("M6.0 10.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
            ),
        )
        return _serverPath!!
    }

private var _serverPath: SolarIcon? = null
