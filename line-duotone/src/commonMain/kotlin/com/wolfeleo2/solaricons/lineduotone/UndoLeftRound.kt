package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UndoLeftRound: SolarIcon
    get() {
        if (_undoLeftRound != null) return _undoLeftRound!!
        _undoLeftRound = SolarIcon(
            name = "Solar.LineDuotone.UndoLeftRound",
            secondaryPaths = listOf(
                IconPath("M4 7H15C17.7614 7 20 9.23857 20 12C20 14.7614 17.7614 17 15 17H8.00001"),
            ),
            primaryPaths = listOf(
                IconPath("M7 4L4 7L7 10"),
            ),
        )
        return _undoLeftRound!!
    }

private var _undoLeftRound: SolarIcon? = null
