package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundArrowRightUp: SolarIcon
    get() {
        if (_roundArrowRightUp != null) return _roundArrowRightUp!!
        _roundArrowRightUp = SolarIcon(
            name = "Solar.LineDuotone.RoundArrowRightUp",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 15L15 9M15 9H10.5M15 9V13.5"),
            ),
        )
        return _roundArrowRightUp!!
    }

private var _roundArrowRightUp: SolarIcon? = null
