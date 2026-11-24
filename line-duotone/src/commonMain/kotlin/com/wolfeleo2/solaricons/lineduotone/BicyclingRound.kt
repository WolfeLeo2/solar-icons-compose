package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BicyclingRound: SolarIcon
    get() {
        if (_bicyclingRound != null) return _bicyclingRound!!
        _bicyclingRound = SolarIcon(
            name = "Solar.LineDuotone.BicyclingRound",
            secondaryPaths = listOf(
                IconPath("M6.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M18.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M14.0 2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M18.4999 9.99997H14.5822C14.2052 9.99997 13.8393 9.87213 13.5444 9.63733L11.386 7.91916C10.1193 6.91084 8.25168 7.27102 7.45083 8.67806C6.67562 10.0401 7.25192 11.7736 8.68829 12.4004L11.779 13.749C12.7312 14.1646 13.1695 15.2708 12.7603 16.2258L11.9999 18"),
            ),
        )
        return _bicyclingRound!!
    }

private var _bicyclingRound: SolarIcon? = null
