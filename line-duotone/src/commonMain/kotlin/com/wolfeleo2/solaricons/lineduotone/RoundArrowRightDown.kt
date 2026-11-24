package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundArrowRightDown: SolarIcon
    get() {
        if (_roundArrowRightDown != null) return _roundArrowRightDown!!
        _roundArrowRightDown = SolarIcon(
            name = "Solar.LineDuotone.RoundArrowRightDown",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 9L15 15M15 15L15 10.5M15 15L10.5 15"),
            ),
        )
        return _roundArrowRightDown!!
    }

private var _roundArrowRightDown: SolarIcon? = null
