package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundArrowRightUp: SolarIcon
    get() {
        if (_roundArrowRightUp != null) return _roundArrowRightUp!!
        _roundArrowRightUp = SolarIcon(
            name = "Solar.Linear.RoundArrowRightUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M9 15L15 9M15 9H10.5M15 9V13.5"),
            ),
        )
        return _roundArrowRightUp!!
    }

private var _roundArrowRightUp: SolarIcon? = null
