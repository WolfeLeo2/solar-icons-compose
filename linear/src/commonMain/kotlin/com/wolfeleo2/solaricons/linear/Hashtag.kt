package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Hashtag: SolarIcon
    get() {
        if (_hashtag != null) return _hashtag!!
        _hashtag = SolarIcon(
            name = "Solar.Linear.Hashtag",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 3L5 21"),
                IconPath("M19 3L14 21"),
                IconPath("M22 9H4"),
                IconPath("M20 16H2"),
            ),
        )
        return _hashtag!!
    }

private var _hashtag: SolarIcon? = null
