package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MinusCircle: SolarIcon
    get() {
        if (_minusCircle != null) return _minusCircle!!
        _minusCircle = SolarIcon(
            name = "Solar.LineDuotone.MinusCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 12H9"),
            ),
        )
        return _minusCircle!!
    }

private var _minusCircle: SolarIcon? = null
