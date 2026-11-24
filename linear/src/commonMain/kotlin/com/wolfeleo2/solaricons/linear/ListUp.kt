package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListUp: SolarIcon
    get() {
        if (_listUp != null) return _listUp!!
        _listUp = SolarIcon(
            name = "Solar.Linear.ListUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 18L17.5 15L21 18"),
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
            ),
        )
        return _listUp!!
    }

private var _listUp: SolarIcon? = null
