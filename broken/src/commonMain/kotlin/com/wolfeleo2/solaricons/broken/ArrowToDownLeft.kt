package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ArrowToDownLeft: SolarIcon
    get() {
        if (_arrowToDownLeft != null) return _arrowToDownLeft!!
        _arrowToDownLeft = SolarIcon(
            name = "Solar.Broken.ArrowToDownLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 19.5L17 14.5M12 19.5L7 14.5M12 19.5L12 13M12 9.5C12 7.83333 11 4.5 7 4.5"),
            ),
        )
        return _arrowToDownLeft!!
    }

private var _arrowToDownLeft: SolarIcon? = null
