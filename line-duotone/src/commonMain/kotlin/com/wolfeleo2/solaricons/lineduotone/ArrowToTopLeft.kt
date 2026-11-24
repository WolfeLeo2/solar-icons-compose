package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowToTopLeft: SolarIcon
    get() {
        if (_arrowToTopLeft != null) return _arrowToTopLeft!!
        _arrowToTopLeft = SolarIcon(
            name = "Solar.LineDuotone.ArrowToTopLeft",
            secondaryPaths = listOf(
                IconPath("M12 4.5C12 4.5 12 12.8333 12 14.5C12 16.1667 11 19.5 7 19.5"),
            ),
            primaryPaths = listOf(
                IconPath("M17 9.5L12 4.5L7 9.5"),
            ),
        )
        return _arrowToTopLeft!!
    }

private var _arrowToTopLeft: SolarIcon? = null
