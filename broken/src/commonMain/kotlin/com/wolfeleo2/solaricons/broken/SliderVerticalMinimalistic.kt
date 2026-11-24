package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SliderVerticalMinimalistic: SolarIcon
    get() {
        if (_sliderVerticalMinimalistic != null) return _sliderVerticalMinimalistic!!
        _sliderVerticalMinimalistic = SolarIcon(
            name = "Solar.Broken.SliderVerticalMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 8C18 5.17157 18 3.75736 17.1213 2.87868C16.2426 2 14.8284 2 12 2C9.17157 2 7.75736 2 6.87868 2.87868C6 3.75736 6 5.17157 6 8V16C6 18.8284 6 20.2426 6.87868 21.1213C7.75736 22 9.17157 22 12 22C14.8284 22 16.2426 22 17.1213 21.1213C18 20.2426 18 18.8284 18 16V12"),
                IconPath("M21 4.5L21 19.5"),
                IconPath("M3 4.5L3 19.5"),
            ),
        )
        return _sliderVerticalMinimalistic!!
    }

private var _sliderVerticalMinimalistic: SolarIcon? = null
