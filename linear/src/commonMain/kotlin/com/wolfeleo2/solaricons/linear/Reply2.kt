package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Reply2: SolarIcon
    get() {
        if (_reply2 != null) return _reply2!!
        _reply2 = SolarIcon(
            name = "Solar.Linear.Reply2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4.5 12L9.5 17M4.5 12L9.5 7M4.5 12L14.5 12C16.1667 12 19.5 11 19.5 7"),
            ),
        )
        return _reply2!!
    }

private var _reply2: SolarIcon? = null
