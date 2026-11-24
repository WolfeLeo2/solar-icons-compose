package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UndoRight: SolarIcon
    get() {
        if (_undoRight != null) return _undoRight!!
        _undoRight = SolarIcon(
            name = "Solar.LineDuotone.UndoRight",
            secondaryPaths = listOf(
                IconPath("M20 7H9.00001C7.13077 7 6.19615 7 5.5 7.40193C5.04395 7.66523 4.66524 8.04394 4.40193 8.49999C4 9.19615 4 10.1308 4 12C4 13.8692 4 14.8038 4.40192 15.5C4.66523 15.9561 5.04394 16.3348 5.5 16.5981C6.19615 17 7.13077 17 9 17H16"),
            ),
            primaryPaths = listOf(
                IconPath("M17 4L20 7L17 10"),
            ),
        )
        return _undoRight!!
    }

private var _undoRight: SolarIcon? = null
