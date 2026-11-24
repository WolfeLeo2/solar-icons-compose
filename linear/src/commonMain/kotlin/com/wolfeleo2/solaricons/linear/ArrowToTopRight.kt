package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowToTopRight: SolarIcon
    get() {
        if (_arrowToTopRight != null) return _arrowToTopRight!!
        _arrowToTopRight = SolarIcon(
            name = "Solar.Linear.ArrowToTopRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4.5L7 9.5M12 4.5L17 9.5M12 4.5C12 4.5 12 12.8333 12 14.5C12 16.1667 13 19.5 17 19.5"),
            ),
        )
        return _arrowToTopRight!!
    }

private var _arrowToTopRight: SolarIcon? = null
