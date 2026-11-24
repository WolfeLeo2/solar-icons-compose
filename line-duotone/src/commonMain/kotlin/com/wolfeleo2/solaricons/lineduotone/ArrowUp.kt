package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowUp: SolarIcon
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = SolarIcon(
            name = "Solar.LineDuotone.ArrowUp",
            secondaryPaths = listOf(
                IconPath("M11.25 20C11.25 20.4142 11.5858 20.75 12 20.75C12.4142 20.75 12.75 20.4142 12.75 20L11.25 20ZM12.75 20L12.75 4L11.25 4L11.25 20L12.75 20Z"),
            ),
            primaryPaths = listOf(
                IconPath("M18 10L12 4L6 10"),
            ),
        )
        return _arrowUp!!
    }

private var _arrowUp: SolarIcon? = null
