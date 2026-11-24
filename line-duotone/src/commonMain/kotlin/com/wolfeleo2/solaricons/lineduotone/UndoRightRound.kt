package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UndoRightRound: SolarIcon
    get() {
        if (_undoRightRound != null) return _undoRightRound!!
        _undoRightRound = SolarIcon(
            name = "Solar.LineDuotone.UndoRightRound",
            secondaryPaths = listOf(
                IconPath("M20 7H9.00001C6.23858 7 4 9.23857 4 12C4 14.7614 6.23858 17 9 17H16"),
            ),
            primaryPaths = listOf(
                IconPath("M17 4L20 7L17 10"),
            ),
        )
        return _undoRightRound!!
    }

private var _undoRightRound: SolarIcon? = null
