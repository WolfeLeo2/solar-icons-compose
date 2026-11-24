package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CloseCircle: SolarIcon
    get() {
        if (_closeCircle != null) return _closeCircle!!
        _closeCircle = SolarIcon(
            name = "Solar.Linear.CloseCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M14.5 9.49999L9.5 14.5M9.49998 9.49997L14.5 14.4999"),
            ),
        )
        return _closeCircle!!
    }

private var _closeCircle: SolarIcon? = null
