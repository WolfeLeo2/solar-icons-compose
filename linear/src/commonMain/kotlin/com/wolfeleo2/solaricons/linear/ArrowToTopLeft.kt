package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowToTopLeft: SolarIcon
    get() {
        if (_arrowToTopLeft != null) return _arrowToTopLeft!!
        _arrowToTopLeft = SolarIcon(
            name = "Solar.Linear.ArrowToTopLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4.5L17 9.5M12 4.5L7 9.5M12 4.5C12 4.5 12 12.8333 12 14.5C12 16.1667 11 19.5 7 19.5"),
            ),
        )
        return _arrowToTopLeft!!
    }

private var _arrowToTopLeft: SolarIcon? = null
