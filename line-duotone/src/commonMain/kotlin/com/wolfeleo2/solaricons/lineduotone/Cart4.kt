package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Cart4: SolarIcon
    get() {
        if (_cart4 != null) return _cart4!!
        _cart4 = SolarIcon(
            name = "Solar.LineDuotone.Cart4",
            secondaryPaths = listOf(
                IconPath("M3 11H21"),
                IconPath("M10 14H14"),
                IconPath("M18 9L15 3"),
                IconPath("M6 9L9 3"),
            ),
            primaryPaths = listOf(
                IconPath("M3.55514 14.2572C2.83668 10.9043 2.47745 9.22793 3.378 8.11397C4.27855 7 5.99302 7 9.42196 7H14.5781C18.0071 7 19.7215 7 20.6221 8.11397C21.5226 9.22793 21.1634 10.9043 20.4449 14.2572L20.0164 16.2572C19.5294 18.5297 19.2859 19.666 18.4608 20.333C17.6357 21 16.4737 21 14.1495 21H9.85053C7.52639 21 6.36432 21 5.53925 20.333C4.71418 19.666 4.47069 18.5297 3.98372 16.2572L3.55514 14.2572Z"),
            ),
        )
        return _cart4!!
    }

private var _cart4: SolarIcon? = null
