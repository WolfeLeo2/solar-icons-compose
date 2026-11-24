package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Power: SolarIcon
    get() {
        if (_power != null) return _power!!
        _power = SolarIcon(
            name = "Solar.LineDuotone.Power",
            secondaryPaths = listOf(
                IconPath("M12 2V6"),
            ),
            primaryPaths = listOf(
                IconPath("M8.5 3.70593C5.26806 5.07145 3 8.27087 3 12C3 16.9706 7.02944 21 12 21C16.9706 21 21 16.9706 21 12C21 8.27087 18.7319 5.07145 15.5 3.70593"),
            ),
        )
        return _power!!
    }

private var _power: SolarIcon? = null
