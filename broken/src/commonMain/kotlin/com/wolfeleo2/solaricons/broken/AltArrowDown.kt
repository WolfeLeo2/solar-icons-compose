package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.AltArrowDown: SolarIcon
    get() {
        if (_altArrowDown != null) return _altArrowDown!!
        _altArrowDown = SolarIcon(
            name = "Solar.Broken.AltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 9L12 15L10.25 13.5M5 9L7.33333 11"),
            ),
        )
        return _altArrowDown!!
    }

private var _altArrowDown: SolarIcon? = null
