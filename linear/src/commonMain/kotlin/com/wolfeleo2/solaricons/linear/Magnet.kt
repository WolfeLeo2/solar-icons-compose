package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Magnet: SolarIcon
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = SolarIcon(
            name = "Solar.Linear.Magnet",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 2H19.5C20.3284 2 21 2.67157 21 3.5V5.5C21 6.32843 20.3284 7 19.5 7H17M17 2H13C7.47715 2 3 6.47715 3 12C3 17.5228 7.47715 22 13 22H17M17 2V7M17 7H13C10.2386 7 8 9.23858 8 12C8 14.7614 10.2386 17 13 17H17M17 17H19.5C20.3284 17 21 17.6716 21 18.5V20.5C21 21.3284 20.3284 22 19.5 22H17M17 17V22"),
            ),
        )
        return _magnet!!
    }

private var _magnet: SolarIcon? = null
