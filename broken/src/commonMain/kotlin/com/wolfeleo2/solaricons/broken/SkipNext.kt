package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SkipNext: SolarIcon
    get() {
        if (_skipNext != null) return _skipNext!!
        _skipNext = SolarIcon(
            name = "Solar.Broken.SkipNext",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 11L2 18.9671C2 21.2763 4.13419 22.736 5.87083 21.6145L16.6598 14.6474C18.4467 13.4935 18.4467 10.5065 16.6598 9.35258L5.87084 2.38548C4.13419 1.26402 2 2.72368 2 5.03289V7"),
                IconPath("M22 5V12M22 16V19"),
            ),
        )
        return _skipNext!!
    }

private var _skipNext: SolarIcon? = null
