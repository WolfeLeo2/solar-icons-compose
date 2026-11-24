package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Sun2: SolarIcon
    get() {
        if (_sun2 != null) return _sun2!!
        _sun2 = SolarIcon(
            name = "Solar.Broken.Sun2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7.28451 10.3333C7.10026 10.8546 7 11.4156 7 12C7 14.7614 9.23858 17 12 17C14.7614 17 17 14.7614 17 12C17 9.23858 14.7614 7 12 7C11.4156 7 10.8546 7.10026 10.3333 7.28451"),
                IconPath("M12 2V4"),
                IconPath("M12 20V22"),
                IconPath("M4 12L2 12"),
                IconPath("M22 12L20 12"),
                IconPath("M19.7778 4.22217L17.5558 6.25375"),
                IconPath("M4.22217 4.22217L6.44418 6.25375"),
                IconPath("M6.44434 17.5557L4.22211 19.7779"),
                IconPath("M19.7778 19.7778L17.5558 17.5555"),
            ),
        )
        return _sun2!!
    }

private var _sun2: SolarIcon? = null
