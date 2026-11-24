package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.AlarmSleep: SolarIcon
    get() {
        if (_alarmSleep != null) return _alarmSleep!!
        _alarmSleep = SolarIcon(
            name = "Solar.Linear.AlarmSleep",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 4.0 a9.0 9.0 0 1 0 0 18.0 a9.0 9.0 0 1 0 0 -18.0z"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
                IconPath("M9 10H15L9 16H15"),
            ),
        )
        return _alarmSleep!!
    }

private var _alarmSleep: SolarIcon? = null
