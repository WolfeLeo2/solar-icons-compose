package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RoundArrowRight: SolarIcon
    get() {
        if (_roundArrowRight != null) return _roundArrowRight!!
        _roundArrowRight = SolarIcon(
            name = "Solar.Linear.RoundArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M8 12C12.6863 12 11.3137 12 16 12M16 12L13 9M16 12L13 15"),
            ),
        )
        return _roundArrowRight!!
    }

private var _roundArrowRight: SolarIcon? = null
