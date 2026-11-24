package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Bowling: SolarIcon
    get() {
        if (_bowling != null) return _bowling!!
        _bowling = SolarIcon(
            name = "Solar.Linear.Bowling",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M12.0 5.5 a1.5 1.5 0 1 0 0 3.0 a1.5 1.5 0 1 0 0 -3.0z"),
                IconPath("M12.0 10.5 a1.5 1.5 0 1 0 0 3.0 a1.5 1.5 0 1 0 0 -3.0z"),
                IconPath("M8 8C8.82843 8 9.5 8.67157 9.5 9.5C9.5 10.3284 8.82843 11 8 11C7.17157 11 6.5 10.3284 6.5 9.5C6.5 8.67157 7.17157 8 8 8Z"),
            ),
        )
        return _bowling!!
    }

private var _bowling: SolarIcon? = null
