package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.StretchingRound: SolarIcon
    get() {
        if (_stretchingRound != null) return _stretchingRound!!
        _stretchingRound = SolarIcon(
            name = "Solar.Broken.StretchingRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14.5 2.0 a2.5 2.5 0 1 0 0 5.0 a2.5 2.5 0 1 0 0 -5.0z"),
                IconPath("M19 21.9955V18.0484C19 16.2725 17.395 14.9194 15.6265 15.2042M7.94806 13.4343L7.92328 13.4104C6.88143 12.4036 7.6864 10.7847 8.5932 10.1422C9.5 9.49967 13.3451 8.49967 13.3451 13.4341C13.3451 15.1268 12.8704 16.7126 12.0433 18.0484M5 21.9998C6.46053 21.9998 7.82003 21.6251 9 20.9674"),
            ),
        )
        return _stretchingRound!!
    }

private var _stretchingRound: SolarIcon? = null
