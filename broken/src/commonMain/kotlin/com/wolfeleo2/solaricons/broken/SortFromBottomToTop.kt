package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SortFromBottomToTop: SolarIcon
    get() {
        if (_sortFromBottomToTop != null) return _sortFromBottomToTop!!
        _sortFromBottomToTop = SolarIcon(
            name = "Solar.Broken.SortFromBottomToTop",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 8H13"),
                IconPath("M6 13H13"),
                IconPath("M8 18H13"),
                IconPath("M17 20V4L20 8"),
            ),
        )
        return _sortFromBottomToTop!!
    }

private var _sortFromBottomToTop: SolarIcon? = null
