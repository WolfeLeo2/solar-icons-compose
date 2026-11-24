package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.UndoLeftRound: SolarIcon
    get() {
        if (_undoLeftRound != null) return _undoLeftRound!!
        _undoLeftRound = SolarIcon(
            name = "Solar.Broken.UndoLeftRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 7H15C17.7614 7 20 9.23857 20 12C20 14.7614 17.7614 17 15 17M4 7L7 4M4 7L7 10M8.00001 17H11"),
            ),
        )
        return _undoLeftRound!!
    }

private var _undoLeftRound: SolarIcon? = null
