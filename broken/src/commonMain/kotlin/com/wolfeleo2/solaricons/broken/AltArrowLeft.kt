package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.AltArrowLeft: SolarIcon
    get() {
        if (_altArrowLeft != null) return _altArrowLeft!!
        _altArrowLeft = SolarIcon(
            name = "Solar.Broken.AltArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 19L9 12L10.5 10.25M15 5L13 7.33333"),
            ),
        )
        return _altArrowLeft!!
    }

private var _altArrowLeft: SolarIcon? = null
