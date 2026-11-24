package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ConfoundedCircle: SolarIcon
    get() {
        if (_confoundedCircle != null) return _confoundedCircle!!
        _confoundedCircle = SolarIcon(
            name = "Solar.LineDuotone.ConfoundedCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M8 12L10 10.5L8 9"),
                IconPath("M16 12L14 10.5L16 9"),
                IconPath("M15 16L14 15L13 16L12 15L11 16L10 15L9 16"),
            ),
        )
        return _confoundedCircle!!
    }

private var _confoundedCircle: SolarIcon? = null
