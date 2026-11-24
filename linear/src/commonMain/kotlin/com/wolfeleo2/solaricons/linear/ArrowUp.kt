package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowUp: SolarIcon
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = SolarIcon(
            name = "Solar.Linear.ArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 20L12 4M12 4L18 10M12 4L6 10"),
            ),
        )
        return _arrowUp!!
    }

private var _arrowUp: SolarIcon? = null
