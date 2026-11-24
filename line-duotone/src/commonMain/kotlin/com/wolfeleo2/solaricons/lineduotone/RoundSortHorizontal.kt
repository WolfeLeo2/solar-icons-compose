package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundSortHorizontal: SolarIcon
    get() {
        if (_roundSortHorizontal != null) return _roundSortHorizontal!!
        _roundSortHorizontal = SolarIcon(
            name = "Solar.LineDuotone.RoundSortHorizontal",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M16 9.5L8 9.5M8 9.5L10.75 7M8 9.5L10.75 12"),
                IconPath("M8 14.5L16 14.5M16 14.5L13.25 12M16 14.5L13.25 17"),
            ),
        )
        return _roundSortHorizontal!!
    }

private var _roundSortHorizontal: SolarIcon? = null
