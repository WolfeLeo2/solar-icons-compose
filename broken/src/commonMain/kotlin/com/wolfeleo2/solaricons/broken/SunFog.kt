package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SunFog: SolarIcon
    get() {
        if (_sunFog != null) return _sunFog!!
        _sunFog = SolarIcon(
            name = "Solar.Broken.SunFog",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 22H16"),
                IconPath("M5 19H19"),
                IconPath("M2 16H22"),
                IconPath("M10 6.34141C10.6256 6.12031 11.2987 6 12 6C15.3137 6 18 8.68629 18 12C18 13.5217 17.4335 14.911 16.5 15.9687H7.5C6.56645 14.911 6 13.5217 6 12C6 11.2987 6.12031 10.6256 6.34141 10"),
                IconPath("M12 2V3"),
                IconPath("M22 12L21 12"),
                IconPath("M3 12L2 12"),
                IconPath("M19.0708 4.9292L18.678 5.32204"),
                IconPath("M5.32178 5.32178L4.92894 4.92894"),
            ),
        )
        return _sunFog!!
    }

private var _sunFog: SolarIcon? = null
