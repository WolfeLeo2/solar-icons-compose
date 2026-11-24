package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Sun: SolarIcon
    get() {
        if (_sun != null) return _sun!!
        _sun = SolarIcon(
            name = "Solar.Linear.Sun",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 6.0 a6.0 6.0 0 1 0 0 12.0 a6.0 6.0 0 1 0 0 -12.0z"),
                IconPath("M12 2V3"),
                IconPath("M12 21V22"),
                IconPath("M22 12L21 12"),
                IconPath("M3 12L2 12"),
                IconPath("M19.0708 4.9292L18.678 5.32204"),
                IconPath("M5.32178 18.6782L4.92894 19.0711"),
                IconPath("M19.0708 19.0708L18.678 18.678"),
                IconPath("M5.32178 5.32178L4.92894 4.92894"),
            ),
        )
        return _sun!!
    }

private var _sun: SolarIcon? = null
