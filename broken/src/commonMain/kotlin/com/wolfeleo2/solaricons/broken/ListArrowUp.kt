package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListArrowUp: SolarIcon
    get() {
        if (_listArrowUp != null) return _listArrowUp!!
        _listArrowUp = SolarIcon(
            name = "Solar.Broken.ListArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
                IconPath("M20 16.5L17.5 14M17.5 14L15 16.5M17.5 14V20"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listArrowUp!!
    }

private var _listArrowUp: SolarIcon? = null
