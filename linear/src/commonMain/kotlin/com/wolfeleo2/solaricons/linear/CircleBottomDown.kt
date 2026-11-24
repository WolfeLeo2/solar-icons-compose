package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.CircleBottomDown: SolarIcon
    get() {
        if (_circleBottomDown != null) return _circleBottomDown!!
        _circleBottomDown = SolarIcon(
            name = "Solar.Linear.CircleBottomDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 14L2 22M2 22H8M2 22V16"),
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12"),
            ),
        )
        return _circleBottomDown!!
    }

private var _circleBottomDown: SolarIcon? = null
