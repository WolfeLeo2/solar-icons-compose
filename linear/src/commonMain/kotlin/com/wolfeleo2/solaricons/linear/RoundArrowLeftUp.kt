package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundArrowLeftUp: SolarIcon
    get() {
        if (_roundArrowLeftUp != null) return _roundArrowLeftUp!!
        _roundArrowLeftUp = SolarIcon(
            name = "Solar.Linear.RoundArrowLeftUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M15 15L9 9M9 9H13.5M9 9V13.5"),
            ),
        )
        return _roundArrowLeftUp!!
    }

private var _roundArrowLeftUp: SolarIcon? = null
