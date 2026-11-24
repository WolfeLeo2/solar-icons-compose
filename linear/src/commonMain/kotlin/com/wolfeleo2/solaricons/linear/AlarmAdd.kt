package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.AlarmAdd: SolarIcon
    get() {
        if (_alarmAdd != null) return _alarmAdd!!
        _alarmAdd = SolarIcon(
            name = "Solar.Linear.AlarmAdd",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 4.0 a9.0 9.0 0 1 0 0 18.0 a9.0 9.0 0 1 0 0 -18.0z"),
                IconPath("M15 13L12 13M12 13L9 13M12 13L12 10M12 13L12 16"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
            ),
        )
        return _alarmAdd!!
    }

private var _alarmAdd: SolarIcon? = null
