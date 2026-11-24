package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SkipNext: SolarIcon
    get() {
        if (_skipNext != null) return _skipNext!!
        _skipNext = SolarIcon(
            name = "Solar.Linear.SkipNext",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16.6598 9.35258C18.4467 10.5065 18.4467 13.4935 16.6598 14.6474L5.87083 21.6145C4.13419 22.736 2 21.2763 2 18.9671L2 5.0329C2 2.72368 4.13419 1.26402 5.87083 2.38548L16.6598 9.35258Z"),
                IconPath("M22 5V19"),
            ),
        )
        return _skipNext!!
    }

private var _skipNext: SolarIcon? = null
