package com.wolfeleo2.solaricons.outline

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Outline.SunFog: SolarIcon
    get() {
        if (_sunFog != null) return _sunFog!!
        _sunFog = SolarIcon(
            name = "Solar.Outline.SunFog",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 22H16"),
                IconPath("M5 19H19"),
                IconPath("M2 16H22"),
                IconPath("M12 6C8.68629 6 6 8.68629 6 12C6 13.5217 6.56645 14.911 7.5 15.9687H16.5C17.4335 14.911 18 13.5217 18 12C18 8.68629 15.3137 6 12 6Z"),
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
