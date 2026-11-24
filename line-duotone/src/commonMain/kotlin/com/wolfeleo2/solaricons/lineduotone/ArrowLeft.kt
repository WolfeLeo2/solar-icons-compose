package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowLeft: SolarIcon
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = SolarIcon(
            name = "Solar.LineDuotone.ArrowLeft",
            secondaryPaths = listOf(
                IconPath("M20 12.75C20.4142 12.75 20.75 12.4142 20.75 12C20.75 11.5858 20.4142 11.25 20 11.25V12.75ZM20 11.25H4V12.75H20V11.25Z"),
            ),
            primaryPaths = listOf(
                IconPath("M10 6L4 12L10 18"),
            ),
        )
        return _arrowLeft!!
    }

private var _arrowLeft: SolarIcon? = null
