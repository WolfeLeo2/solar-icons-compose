package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowToDownLeft: SolarIcon
    get() {
        if (_arrowToDownLeft != null) return _arrowToDownLeft!!
        _arrowToDownLeft = SolarIcon(
            name = "Solar.LineDuotone.ArrowToDownLeft",
            secondaryPaths = listOf(
                IconPath("M12 19.5C12 19.5 12 11.1667 12 9.5C12 7.83333 11 4.5 7 4.5"),
            ),
            primaryPaths = listOf(
                IconPath("M17 14.5L12 19.5L7 14.5"),
            ),
        )
        return _arrowToDownLeft!!
    }

private var _arrowToDownLeft: SolarIcon? = null
