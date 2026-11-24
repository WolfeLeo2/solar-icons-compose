package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Sun: SolarIcon
    get() {
        if (_sun != null) return _sun!!
        _sun = SolarIcon(
            name = "Solar.Broken.Sun",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2V3"),
                IconPath("M12 21V22"),
                IconPath("M22 12L21 12"),
                IconPath("M3 12L2 12"),
                IconPath("M19.0708 4.9292L18.678 5.32204"),
                IconPath("M5.32178 18.6782L4.92894 19.0711"),
                IconPath("M19.0708 19.0708L18.678 18.678"),
                IconPath("M5.32178 5.32178L4.92894 4.92894"),
                IconPath("M6.34141 10C6.12031 10.6256 6 11.2987 6 12C6 15.3137 8.68629 18 12 18C15.3137 18 18 15.3137 18 12C18 8.68629 15.3137 6 12 6C11.2987 6 10.6256 6.12031 10 6.34141"),
            ),
        )
        return _sun!!
    }

private var _sun: SolarIcon? = null
