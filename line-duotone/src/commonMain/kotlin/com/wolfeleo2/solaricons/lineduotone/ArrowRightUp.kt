package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowRightUp: SolarIcon
    get() {
        if (_arrowRightUp != null) return _arrowRightUp!!
        _arrowRightUp = SolarIcon(
            name = "Solar.LineDuotone.ArrowRightUp",
            secondaryPaths = listOf(
                IconPath("M5.46967 17.4697C5.17678 17.7626 5.17678 18.2374 5.46967 18.5303C5.76256 18.8232 6.23744 18.8232 6.53033 18.5303L5.46967 17.4697ZM6.53033 18.5303L18.5303 6.53033L17.4697 5.46967L5.46967 17.4697L6.53033 18.5303Z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 6H18V15"),
            ),
        )
        return _arrowRightUp!!
    }

private var _arrowRightUp: SolarIcon? = null
