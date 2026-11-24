package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundDoubleAltArrowRight: SolarIcon
    get() {
        if (_roundDoubleAltArrowRight != null) return _roundDoubleAltArrowRight!!
        _roundDoubleAltArrowRight = SolarIcon(
            name = "Solar.LineDuotone.RoundDoubleAltArrowRight",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M8.5 9L11.5 12L8.5 15"),
                IconPath("M12.5 9L15.5 12L12.5 15"),
            ),
        )
        return _roundDoubleAltArrowRight!!
    }

private var _roundDoubleAltArrowRight: SolarIcon? = null
