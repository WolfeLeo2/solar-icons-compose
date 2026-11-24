package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListCross: SolarIcon
    get() {
        if (_listCross != null) return _listCross!!
        _listCross = SolarIcon(
            name = "Solar.Broken.ListCross",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 18.5L20 13.5M20 18.5L15 13.5"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listCross!!
    }

private var _listCross: SolarIcon? = null
