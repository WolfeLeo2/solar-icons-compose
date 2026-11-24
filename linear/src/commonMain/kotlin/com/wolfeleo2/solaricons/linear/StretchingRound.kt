package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.StretchingRound: SolarIcon
    get() {
        if (_stretchingRound != null) return _stretchingRound!!
        _stretchingRound = SolarIcon(
            name = "Solar.Linear.StretchingRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14.5 2.0 a2.5 2.5 0 1 0 0 5.0 a2.5 2.5 0 1 0 0 -5.0z"),
                IconPath("M19 21.9955V18.0484C19 16.2725 17.395 14.9194 15.6265 15.2042M7.94806 13.4343L7.92328 13.4104C6.88143 12.4036 7.6864 10.7847 8.5932 10.1422C9.5 9.49967 13.3451 8.49967 13.3451 13.4341C13.3451 18.1285 9.69442 21.9998 5 21.9998"),
            ),
        )
        return _stretchingRound!!
    }

private var _stretchingRound: SolarIcon? = null
