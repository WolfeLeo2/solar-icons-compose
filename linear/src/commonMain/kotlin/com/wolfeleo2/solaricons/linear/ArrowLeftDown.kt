package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowLeftDown: SolarIcon
    get() {
        if (_arrowLeftDown != null) return _arrowLeftDown!!
        _arrowLeftDown = SolarIcon(
            name = "Solar.Linear.ArrowLeftDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 6L6 18M6 18L6 9M6 18L15 18"),
            ),
        )
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: SolarIcon? = null
