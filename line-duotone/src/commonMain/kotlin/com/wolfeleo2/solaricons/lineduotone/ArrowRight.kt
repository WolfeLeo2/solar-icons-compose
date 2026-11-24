package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowRight: SolarIcon
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = SolarIcon(
            name = "Solar.LineDuotone.ArrowRight",
            secondaryPaths = listOf(
                IconPath("M4 11.25C3.58579 11.25 3.25 11.5858 3.25 12C3.25 12.4142 3.58579 12.75 4 12.75V11.25ZM4 12.75H20V11.25H4V12.75Z"),
            ),
            primaryPaths = listOf(
                IconPath("M14 6L20 12L14 18"),
            ),
        )
        return _arrowRight!!
    }

private var _arrowRight: SolarIcon? = null
