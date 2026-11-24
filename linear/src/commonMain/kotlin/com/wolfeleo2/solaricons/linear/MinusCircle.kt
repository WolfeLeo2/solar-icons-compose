package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MinusCircle: SolarIcon
    get() {
        if (_minusCircle != null) return _minusCircle!!
        _minusCircle = SolarIcon(
            name = "Solar.Linear.MinusCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M15 12H9"),
            ),
        )
        return _minusCircle!!
    }

private var _minusCircle: SolarIcon? = null
