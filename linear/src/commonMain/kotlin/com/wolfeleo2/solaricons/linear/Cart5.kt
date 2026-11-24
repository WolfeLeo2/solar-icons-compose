package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Cart5: SolarIcon
    get() {
        if (_cart5 != null) return _cart5!!
        _cart5 = SolarIcon(
            name = "Solar.Linear.Cart5",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3.55508 14.2572C2.83662 10.9043 2.47739 9.22793 3.37794 8.11397C4.27849 7 5.99296 7 9.4219 7H14.578C18.007 7 19.7215 7 20.622 8.11397C21.5226 9.22793 21.1633 10.9043 20.4449 14.2572L20.0163 16.2572C19.5293 18.5297 19.2858 19.666 18.4608 20.333C17.6357 21 16.4736 21 14.1495 21H9.85047C7.52633 21 6.36426 21 5.53919 20.333C4.71412 19.666 4.47063 18.5297 3.98365 16.2572L3.55508 14.2572Z"),
                IconPath("M8 12H16"),
                IconPath("M10 15H14"),
                IconPath("M18 9L15 3"),
                IconPath("M6 9L9 3"),
            ),
        )
        return _cart5!!
    }

private var _cart5: SolarIcon? = null
