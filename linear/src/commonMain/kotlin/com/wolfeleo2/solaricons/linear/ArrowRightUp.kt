package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowRightUp: SolarIcon
    get() {
        if (_arrowRightUp != null) return _arrowRightUp!!
        _arrowRightUp = SolarIcon(
            name = "Solar.Linear.ArrowRightUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 18L18 6M18 6H9M18 6V15"),
            ),
        )
        return _arrowRightUp!!
    }

private var _arrowRightUp: SolarIcon? = null
