package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListArrowDown: SolarIcon
    get() {
        if (_listArrowDown != null) return _listArrowDown!!
        _listArrowDown = SolarIcon(
            name = "Solar.Broken.ListArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 17.5L17.5 20M17.5 20L20 17.5M17.5 20V14"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listArrowDown!!
    }

private var _listArrowDown: SolarIcon? = null
