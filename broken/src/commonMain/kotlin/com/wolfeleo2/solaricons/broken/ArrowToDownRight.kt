package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowToDownRight: SolarIcon
    get() {
        if (_arrowToDownRight != null) return _arrowToDownRight!!
        _arrowToDownRight = SolarIcon(
            name = "Solar.Broken.ArrowToDownRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 19.5L7 14.5M12 19.5L17 14.5M12 19.5L12 13M12 9.5C12 7.83333 13 4.5 17 4.5"),
            ),
        )
        return _arrowToDownRight!!
    }

private var _arrowToDownRight: SolarIcon? = null
