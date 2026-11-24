package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.List1: SolarIcon
    get() {
        if (_list1 != null) return _list1!!
        _list1 = SolarIcon(
            name = "Solar.Broken.List1",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 7L4 7"),
                IconPath("M15 12L4 12"),
                IconPath("M9 17H4"),
            ),
        )
        return _list1!!
    }

private var _list1: SolarIcon? = null
