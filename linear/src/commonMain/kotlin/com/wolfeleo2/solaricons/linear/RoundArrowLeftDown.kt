package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundArrowLeftDown: SolarIcon
    get() {
        if (_roundArrowLeftDown != null) return _roundArrowLeftDown!!
        _roundArrowLeftDown = SolarIcon(
            name = "Solar.Linear.RoundArrowLeftDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M15 9L9 15M9 15L9 10.5M9 15L13.5 15"),
            ),
        )
        return _roundArrowLeftDown!!
    }

private var _roundArrowLeftDown: SolarIcon? = null
