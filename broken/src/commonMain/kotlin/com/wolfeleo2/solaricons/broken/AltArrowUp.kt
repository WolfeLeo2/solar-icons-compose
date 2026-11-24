package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.AltArrowUp: SolarIcon
    get() {
        if (_altArrowUp != null) return _altArrowUp!!
        _altArrowUp = SolarIcon(
            name = "Solar.Broken.AltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 15L12 9L10.25 10.5M5 15L7.33333 13"),
            ),
        )
        return _altArrowUp!!
    }

private var _altArrowUp: SolarIcon? = null
