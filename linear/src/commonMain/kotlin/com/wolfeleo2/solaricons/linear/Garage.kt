package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Garage: SolarIcon
    get() {
        if (_garage != null) return _garage!!
        _garage = SolarIcon(
            name = "Solar.Linear.Garage",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 22L2 22"),
                IconPath("M3 22.0001V11.3472C3 10.4903 3.36644 9.67432 4.00691 9.10502L10.0069 3.77169C11.1436 2.76133 12.8564 2.76133 13.9931 3.77169L19.9931 9.10502C20.6336 9.67432 21 10.4903 21 11.3472V22.0001"),
                IconPath("M10 9H14"),
                IconPath("M9 15.5H15"),
                IconPath("M9 18.5H15"),
                IconPath("M18 22V16C18 14.1144 18 13.1716 17.4142 12.5858C16.8284 12 15.8856 12 14 12H10C8.11438 12 7.17157 12 6.58579 12.5858C6 13.1716 6 14.1144 6 16V22"),
            ),
        )
        return _garage!!
    }

private var _garage: SolarIcon? = null
