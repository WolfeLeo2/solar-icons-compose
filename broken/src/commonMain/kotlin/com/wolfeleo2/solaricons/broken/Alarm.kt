package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Alarm: SolarIcon
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = SolarIcon(
            name = "Solar.Broken.Alarm",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 9V13L14.5 15.5"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
                IconPath("M7.5 5.20404C8.82378 4.43827 10.3607 4 12 4C16.9706 4 21 8.02944 21 13C21 17.9706 16.9706 22 12 22C7.02944 22 3 17.9706 3 13C3 11.3607 3.43827 9.82378 4.20404 8.5"),
            ),
        )
        return _alarm!!
    }

private var _alarm: SolarIcon? = null
