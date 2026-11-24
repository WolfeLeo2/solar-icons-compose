package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SkipPrevious: SolarIcon
    get() {
        if (_skipPrevious != null) return _skipPrevious!!
        _skipPrevious = SolarIcon(
            name = "Solar.Broken.SkipPrevious",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 11L22 18.9671C22 21.2763 19.8658 22.736 18.1292 21.6145L7.34016 14.6474C5.55328 13.4935 5.55328 10.5065 7.34015 9.35258L18.1292 2.38548C19.8658 1.26402 22 2.72368 22 5.03289V7"),
                IconPath("M2 5V12M2 19V16"),
            ),
        )
        return _skipPrevious!!
    }

private var _skipPrevious: SolarIcon? = null
