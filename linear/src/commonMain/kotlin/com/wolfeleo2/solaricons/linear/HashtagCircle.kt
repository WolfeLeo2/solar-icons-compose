package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.HashtagCircle: SolarIcon
    get() {
        if (_hashtagCircle != null) return _hashtagCircle!!
        _hashtagCircle = SolarIcon(
            name = "Solar.Linear.HashtagCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 7L8 17"),
                IconPath("M16 7L13 17"),
                IconPath("M18 10H7"),
                IconPath("M17 14H6"),
                IconPath("M2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12Z"),
            ),
        )
        return _hashtagCircle!!
    }

private var _hashtagCircle: SolarIcon? = null
