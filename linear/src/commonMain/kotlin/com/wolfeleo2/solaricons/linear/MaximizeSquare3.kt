package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MaximizeSquare3: SolarIcon
    get() {
        if (_maximizeSquare3 != null) return _maximizeSquare3!!
        _maximizeSquare3 = SolarIcon(
            name = "Solar.Linear.MaximizeSquare3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 21.9994C17.055 21.9921 19.1785 21.8926 20.5355 20.5355C22 19.0711 22 16.714 22 12C22 7.28595 22 4.92893 20.5355 3.46447C19.071 2 16.714 2 12 2C7.28593 2 4.9289 2 3.46444 3.46447C2.10741 4.8215 2.00785 6.94493 2.00055 11"),
                IconPath("M12 12L17 7M17 7H13.25M17 7V10.75"),
                IconPath("M2 18C2 16.1144 2 15.1716 2.58579 14.5858C3.17157 14 4.11438 14 6 14C7.88562 14 8.82843 14 9.41421 14.5858C10 15.1716 10 16.1144 10 18C10 19.8856 10 20.8284 9.41421 21.4142C8.82843 22 7.88562 22 6 22C4.11438 22 3.17157 22 2.58579 21.4142C2 20.8284 2 19.8856 2 18Z"),
            ),
        )
        return _maximizeSquare3!!
    }

private var _maximizeSquare3: SolarIcon? = null
