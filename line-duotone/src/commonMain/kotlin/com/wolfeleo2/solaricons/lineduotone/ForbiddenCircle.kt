package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ForbiddenCircle: SolarIcon
    get() {
        if (_forbiddenCircle != null) return _forbiddenCircle!!
        _forbiddenCircle = SolarIcon(
            name = "Solar.LineDuotone.ForbiddenCircle",
            secondaryPaths = listOf(
                IconPath("M18.5 5.5L5.50002 18.4998"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
        )
        return _forbiddenCircle!!
    }

private var _forbiddenCircle: SolarIcon? = null
