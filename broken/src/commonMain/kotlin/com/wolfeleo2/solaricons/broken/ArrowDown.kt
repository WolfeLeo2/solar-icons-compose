package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowDown: SolarIcon
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = SolarIcon(
            name = "Solar.Broken.ArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 20L18 14M12 20L6 14M12 20L12 9.5M12 4V6.5"),
            ),
        )
        return _arrowDown!!
    }

private var _arrowDown: SolarIcon? = null
