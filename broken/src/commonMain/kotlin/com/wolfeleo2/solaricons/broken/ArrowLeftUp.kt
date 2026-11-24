package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowLeftUp: SolarIcon
    get() {
        if (_arrowLeftUp != null) return _arrowLeftUp!!
        _arrowLeftUp = SolarIcon(
            name = "Solar.Broken.ArrowLeftUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 6H15M6 6V15M6 6L12.5 12.5M18 18L15.5 15.5"),
            ),
        )
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: SolarIcon? = null
