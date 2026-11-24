package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Power: SolarIcon
    get() {
        if (_power != null) return _power!!
        _power = SolarIcon(
            name = "Solar.Broken.Power",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2V6"),
                IconPath("M8.5 3.70593C5.26806 5.07145 3 8.27087 3 12C3 14.3051 3.86656 16.4078 5.29169 18M15.5 3.70593C18.7319 5.07145 21 8.27087 21 12C21 16.9706 16.9706 21 12 21C10.9481 21 9.93834 20.8196 9 20.4879"),
            ),
        )
        return _power!!
    }

private var _power: SolarIcon? = null
