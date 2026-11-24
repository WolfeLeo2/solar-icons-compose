package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ArrowToDownRight: SolarIcon
    get() {
        if (_arrowToDownRight != null) return _arrowToDownRight!!
        _arrowToDownRight = SolarIcon(
            name = "Solar.Linear.ArrowToDownRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 19.5L7 14.5M12 19.5L17 14.5M12 19.5C12 19.5 12 11.1667 12 9.5C12 7.83333 13 4.5 17 4.5"),
            ),
        )
        return _arrowToDownRight!!
    }

private var _arrowToDownRight: SolarIcon? = null
