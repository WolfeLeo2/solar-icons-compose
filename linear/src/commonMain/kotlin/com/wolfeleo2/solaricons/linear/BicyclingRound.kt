package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.BicyclingRound: SolarIcon
    get() {
        if (_bicyclingRound != null) return _bicyclingRound!!
        _bicyclingRound = SolarIcon(
            name = "Solar.Linear.BicyclingRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14.0 2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M6.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M18.0 15.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M18.5 9.99997H14.5823C14.2053 9.99997 13.8394 9.87213 13.5445 9.63733L11.3861 7.91916C10.1195 6.91084 8.2518 7.27102 7.45096 8.67806C6.67574 10.0401 7.25204 11.7736 8.68841 12.4004L11.7791 13.749C12.7314 14.1646 13.1697 15.2708 12.7604 16.2258L12 18"),
            ),
        )
        return _bicyclingRound!!
    }

private var _bicyclingRound: SolarIcon? = null
