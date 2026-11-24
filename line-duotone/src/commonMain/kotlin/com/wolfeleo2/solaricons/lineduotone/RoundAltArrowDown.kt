package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundAltArrowDown: SolarIcon
    get() {
        if (_roundAltArrowDown != null) return _roundAltArrowDown!!
        _roundAltArrowDown = SolarIcon(
            name = "Solar.LineDuotone.RoundAltArrowDown",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 10.5L12 13.5L9 10.5"),
            ),
        )
        return _roundAltArrowDown!!
    }

private var _roundAltArrowDown: SolarIcon? = null
