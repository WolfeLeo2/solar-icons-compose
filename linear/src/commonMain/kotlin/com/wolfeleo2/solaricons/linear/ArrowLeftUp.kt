package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowLeftUp: SolarIcon
    get() {
        if (_arrowLeftUp != null) return _arrowLeftUp!!
        _arrowLeftUp = SolarIcon(
            name = "Solar.Linear.ArrowLeftUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 18L6 6M6 6H15M6 6V15"),
            ),
        )
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: SolarIcon? = null
