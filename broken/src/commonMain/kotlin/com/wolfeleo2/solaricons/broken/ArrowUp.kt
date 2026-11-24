package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowUp: SolarIcon
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = SolarIcon(
            name = "Solar.Broken.ArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4L6 10M12 4L18 10M12 4L12 14.5M12 20V17.5"),
            ),
        )
        return _arrowUp!!
    }

private var _arrowUp: SolarIcon? = null
