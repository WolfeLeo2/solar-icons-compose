package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowRightDown: SolarIcon
    get() {
        if (_arrowRightDown != null) return _arrowRightDown!!
        _arrowRightDown = SolarIcon(
            name = "Solar.Linear.ArrowRightDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6 6L18 18M18 18L18 9M18 18L9 18"),
            ),
        )
        return _arrowRightDown!!
    }

private var _arrowRightDown: SolarIcon? = null
