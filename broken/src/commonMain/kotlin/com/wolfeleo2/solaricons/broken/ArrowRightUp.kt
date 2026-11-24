package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowRightUp: SolarIcon
    get() {
        if (_arrowRightUp != null) return _arrowRightUp!!
        _arrowRightUp = SolarIcon(
            name = "Solar.Broken.ArrowRightUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 18L8.5 15.5M18 6H9M18 6V15M18 6L11.5 12.5"),
            ),
        )
        return _arrowRightUp!!
    }

private var _arrowRightUp: SolarIcon? = null
