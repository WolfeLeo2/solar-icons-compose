package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowLeftDown: SolarIcon
    get() {
        if (_arrowLeftDown != null) return _arrowLeftDown!!
        _arrowLeftDown = SolarIcon(
            name = "Solar.Broken.ArrowLeftDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 18H15M6 18V9M6 18L12.5 11.5M18 6L15.5 8.5"),
            ),
        )
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: SolarIcon? = null
