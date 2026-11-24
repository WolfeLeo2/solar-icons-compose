package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListCheck: SolarIcon
    get() {
        if (_listCheck != null) return _listCheck!!
        _listCheck = SolarIcon(
            name = "Solar.Broken.ListCheck",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 16L16.1 18.5L20 13.5"),
                IconPath("M10 14H3"),
                IconPath("M10 18H3"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listCheck!!
    }

private var _listCheck: SolarIcon? = null
