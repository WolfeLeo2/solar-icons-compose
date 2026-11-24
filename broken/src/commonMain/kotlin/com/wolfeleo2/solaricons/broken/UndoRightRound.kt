package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.UndoRightRound: SolarIcon
    get() {
        if (_undoRightRound != null) return _undoRightRound!!
        _undoRightRound = SolarIcon(
            name = "Solar.Broken.UndoRightRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 7H9C6.23857 7 4 9.23857 3.99999 12C3.99999 14.7614 6.23857 17 8.99999 17M20 7L17 4M20 7L17 10M16 17H13"),
            ),
        )
        return _undoRightRound!!
    }

private var _undoRightRound: SolarIcon? = null
