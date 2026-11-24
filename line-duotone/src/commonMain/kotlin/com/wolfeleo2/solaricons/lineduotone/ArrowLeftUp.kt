package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowLeftUp: SolarIcon
    get() {
        if (_arrowLeftUp != null) return _arrowLeftUp!!
        _arrowLeftUp = SolarIcon(
            name = "Solar.LineDuotone.ArrowLeftUp",
            secondaryPaths = listOf(
                IconPath("M17.4697 18.5303C17.7626 18.8232 18.2374 18.8232 18.5303 18.5303C18.8232 18.2374 18.8232 17.7626 18.5303 17.4697L17.4697 18.5303ZM18.5303 17.4697L6.53033 5.46967L5.46967 6.53033L17.4697 18.5303L18.5303 17.4697Z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 6H6V15"),
            ),
        )
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: SolarIcon? = null
