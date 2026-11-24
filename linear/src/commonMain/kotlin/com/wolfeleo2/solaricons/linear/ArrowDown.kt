package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowDown: SolarIcon
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = SolarIcon(
            name = "Solar.Linear.ArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4L12 20M12 20L18 14M12 20L6 14"),
            ),
        )
        return _arrowDown!!
    }

private var _arrowDown: SolarIcon? = null
