package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SliderMinimalisticHorizontal: SolarIcon
    get() {
        if (_sliderMinimalisticHorizontal != null) return _sliderMinimalisticHorizontal!!
        _sliderMinimalisticHorizontal = SolarIcon(
            name = "Solar.Linear.SliderMinimalisticHorizontal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 18C5.17157 18 3.75736 18 2.87868 17.1213C2 16.2426 2 14.8284 2 12C2 9.17157 2 7.75736 2.87868 6.87868C3.75736 6 5.17157 6 8 6L16 6C18.8284 6 20.2426 6 21.1213 6.87868C22 7.75736 22 9.17157 22 12C22 14.8284 22 16.2426 21.1213 17.1213C20.2426 18 18.8284 18 16 18H8Z"),
                IconPath("M4.5 3L19.5 3"),
                IconPath("M4.5 21L19.5 21"),
            ),
        )
        return _sliderMinimalisticHorizontal!!
    }

private var _sliderMinimalisticHorizontal: SolarIcon? = null
