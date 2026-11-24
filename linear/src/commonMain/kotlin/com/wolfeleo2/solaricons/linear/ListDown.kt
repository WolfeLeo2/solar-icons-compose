package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.ListDown: SolarIcon
    get() {
        if (_listDown != null) return _listDown!!
        _listDown = SolarIcon(
            name = "Solar.Linear.ListDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 6L3 6"),
                IconPath("M21 10L3 10"),
                IconPath("M10 14H3"),
                IconPath("M10 18H3"),
                IconPath("M14 15L17.5 18L21 15"),
            ),
        )
        return _listDown!!
    }

private var _listDown: SolarIcon? = null
