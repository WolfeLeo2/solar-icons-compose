package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.AltArrowLeft: SolarIcon
    get() {
        if (_altArrowLeft != null) return _altArrowLeft!!
        _altArrowLeft = SolarIcon(
            name = "Solar.LineDuotone.AltArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 5L9 12L15 19"),
            ),
        )
        return _altArrowLeft!!
    }

private var _altArrowLeft: SolarIcon? = null
