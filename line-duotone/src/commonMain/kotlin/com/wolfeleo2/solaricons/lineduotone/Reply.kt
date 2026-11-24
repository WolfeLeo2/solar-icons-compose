package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Reply: SolarIcon
    get() {
        if (_reply != null) return _reply!!
        _reply = SolarIcon(
            name = "Solar.LineDuotone.Reply",
            secondaryPaths = listOf(
                IconPath("M4.5 12L14.5 12C16.1667 12 19.5 13 19.5 17"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 7L4.5 12L9.5 17"),
            ),
        )
        return _reply!!
    }

private var _reply: SolarIcon? = null
