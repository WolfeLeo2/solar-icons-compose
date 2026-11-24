package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundAltArrowLeft: SolarIcon
    get() {
        if (_roundAltArrowLeft != null) return _roundAltArrowLeft!!
        _roundAltArrowLeft = SolarIcon(
            name = "Solar.LineDuotone.RoundAltArrowLeft",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M13.5 9L10.5 12L13.5 15"),
            ),
        )
        return _roundAltArrowLeft!!
    }

private var _roundAltArrowLeft: SolarIcon? = null
