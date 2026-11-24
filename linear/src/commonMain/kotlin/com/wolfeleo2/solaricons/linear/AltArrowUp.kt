package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.AltArrowUp: SolarIcon
    get() {
        if (_altArrowUp != null) return _altArrowUp!!
        _altArrowUp = SolarIcon(
            name = "Solar.Linear.AltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 15L12 9L5 15"),
            ),
        )
        return _altArrowUp!!
    }

private var _altArrowUp: SolarIcon? = null
