package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Alarm: SolarIcon
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = SolarIcon(
            name = "Solar.Linear.Alarm",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 4.0 a9.0 9.0 0 1 0 0 18.0 a9.0 9.0 0 1 0 0 -18.0z"),
                IconPath("M12 9V13L14.5 15.5"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
            ),
        )
        return _alarm!!
    }

private var _alarm: SolarIcon? = null
