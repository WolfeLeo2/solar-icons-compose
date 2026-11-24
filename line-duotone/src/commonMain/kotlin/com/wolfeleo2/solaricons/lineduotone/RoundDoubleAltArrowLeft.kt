package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundDoubleAltArrowLeft: SolarIcon
    get() {
        if (_roundDoubleAltArrowLeft != null) return _roundDoubleAltArrowLeft!!
        _roundDoubleAltArrowLeft = SolarIcon(
            name = "Solar.LineDuotone.RoundDoubleAltArrowLeft",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15.5 9L12.5 12L15.5 15"),
                IconPath("M11.5 9L8.5 12L11.5 15"),
            ),
        )
        return _roundDoubleAltArrowLeft!!
    }

private var _roundDoubleAltArrowLeft: SolarIcon? = null
