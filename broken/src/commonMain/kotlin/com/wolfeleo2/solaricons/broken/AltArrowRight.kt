package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.AltArrowRight: SolarIcon
    get() {
        if (_altArrowRight != null) return _altArrowRight!!
        _altArrowRight = SolarIcon(
            name = "Solar.Broken.AltArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 5L11 7.33333M9 19L15 12L13.5 10.25"),
            ),
        )
        return _altArrowRight!!
    }

private var _altArrowRight: SolarIcon? = null
