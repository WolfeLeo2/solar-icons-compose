package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowToDownRight: SolarIcon
    get() {
        if (_arrowToDownRight != null) return _arrowToDownRight!!
        _arrowToDownRight = SolarIcon(
            name = "Solar.LineDuotone.ArrowToDownRight",
            secondaryPaths = listOf(
                IconPath("M12 19.5C12 19.5 12 11.1667 12 9.5C12 7.83333 13 4.5 17 4.5"),
            ),
            primaryPaths = listOf(
                IconPath("M7 14.5L12 19.5L17 14.5"),
            ),
        )
        return _arrowToDownRight!!
    }

private var _arrowToDownRight: SolarIcon? = null
