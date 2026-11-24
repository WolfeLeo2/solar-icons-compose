package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowRightDown: SolarIcon
    get() {
        if (_arrowRightDown != null) return _arrowRightDown!!
        _arrowRightDown = SolarIcon(
            name = "Solar.Broken.ArrowRightDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18 18H9M18 18V9M18 18L11.5 11.5M6 6L8.5 8.5"),
            ),
        )
        return _arrowRightDown!!
    }

private var _arrowRightDown: SolarIcon? = null
