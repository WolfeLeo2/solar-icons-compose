package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Reply: SolarIcon
    get() {
        if (_reply != null) return _reply!!
        _reply = SolarIcon(
            name = "Solar.Broken.Reply",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4.5 12L9.5 7M4.5 12L9.5 17M4.5 12L11 12M14.5 12C16.1667 12 19.5 13 19.5 17"),
            ),
        )
        return _reply!!
    }

private var _reply: SolarIcon? = null
