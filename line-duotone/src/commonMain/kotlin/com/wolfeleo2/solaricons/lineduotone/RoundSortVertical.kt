package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundSortVertical: SolarIcon
    get() {
        if (_roundSortVertical != null) return _roundSortVertical!!
        _roundSortVertical = SolarIcon(
            name = "Solar.LineDuotone.RoundSortVertical",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 8L9.5 16M9.5 16L7 13.25M9.5 16L12 13.25"),
                IconPath("M14.5 16L14.5 8M14.5 8L12 10.75M14.5 8L17 10.75"),
            ),
        )
        return _roundSortVertical!!
    }

private var _roundSortVertical: SolarIcon? = null
