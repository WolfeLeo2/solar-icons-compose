package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ConfoundedCircle: SolarIcon
    get() {
        if (_confoundedCircle != null) return _confoundedCircle!!
        _confoundedCircle = SolarIcon(
            name = "Solar.Linear.ConfoundedCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M8 12L10 10.5L8 9"),
                IconPath("M16 12L14 10.5L16 9"),
                IconPath("M16 16L14.6667 15L13.3333 16L12 15L10.6667 16L9.33333 15L8 16"),
            ),
        )
        return _confoundedCircle!!
    }

private var _confoundedCircle: SolarIcon? = null
