package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CircleBottomUp: SolarIcon
    get() {
        if (_circleBottomUp != null) return _circleBottomUp!!
        _circleBottomUp = SolarIcon(
            name = "Solar.Linear.CircleBottomUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 21L11 13M11 13H5M11 13V19"),
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12"),
            ),
        )
        return _circleBottomUp!!
    }

private var _circleBottomUp: SolarIcon? = null
