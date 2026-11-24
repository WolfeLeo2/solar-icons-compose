package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundAltArrowRight: SolarIcon
    get() {
        if (_roundAltArrowRight != null) return _roundAltArrowRight!!
        _roundAltArrowRight = SolarIcon(
            name = "Solar.LineDuotone.RoundAltArrowRight",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M10.5 9L13.5 12L10.5 15"),
            ),
        )
        return _roundAltArrowRight!!
    }

private var _roundAltArrowRight: SolarIcon? = null
