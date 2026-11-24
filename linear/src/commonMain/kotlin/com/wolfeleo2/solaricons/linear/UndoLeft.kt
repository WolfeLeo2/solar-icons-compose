package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UndoLeft: SolarIcon
    get() {
        if (_undoLeft != null) return _undoLeft!!
        _undoLeft = SolarIcon(
            name = "Solar.Linear.UndoLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 7H15C16.8692 7 17.8039 7 18.5 7.40193C18.9561 7.66523 19.3348 8.04394 19.5981 8.49999C20 9.19615 20 10.1308 20 12C20 13.8692 20 14.8038 19.5981 15.5C19.3348 15.9561 18.9561 16.3348 18.5 16.5981C17.8039 17 16.8692 17 15 17H8.00001M4 7L7 4M4 7L7 10"),
            ),
        )
        return _undoLeft!!
    }

private var _undoLeft: SolarIcon? = null
