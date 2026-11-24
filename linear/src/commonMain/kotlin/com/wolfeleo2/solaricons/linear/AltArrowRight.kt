package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.AltArrowRight: SolarIcon
    get() {
        if (_altArrowRight != null) return _altArrowRight!!
        _altArrowRight = SolarIcon(
            name = "Solar.Linear.AltArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 5L15 12L9 19"),
            ),
        )
        return _altArrowRight!!
    }

private var _altArrowRight: SolarIcon? = null
