package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Sun2: SolarIcon
    get() {
        if (_sun2 != null) return _sun2!!
        _sun2 = SolarIcon(
            name = "Solar.LineDuotone.Sun2",
            secondaryPaths = listOf(
                IconPath("M19.7778 4.22217L17.5558 6.25375"),
                IconPath("M4.22217 4.22217L6.44418 6.25375"),
                IconPath("M6.44434 17.5557L4.22211 19.7779"),
                IconPath("M19.7778 19.7778L17.5558 17.5555"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 7.0 a5.0 5.0 0 1 0 0 10.0 a5.0 5.0 0 1 0 0 -10.0z"),
                IconPath("M12 2V4"),
                IconPath("M12 20V22"),
                IconPath("M4 12L2 12"),
                IconPath("M22 12L20 12"),
            ),
        )
        return _sun2!!
    }

private var _sun2: SolarIcon? = null
