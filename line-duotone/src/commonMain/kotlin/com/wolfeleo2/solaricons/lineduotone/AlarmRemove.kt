package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.AlarmRemove: SolarIcon
    get() {
        if (_alarmRemove != null) return _alarmRemove!!
        _alarmRemove = SolarIcon(
            name = "Solar.LineDuotone.AlarmRemove",
            secondaryPaths = listOf(
                IconPath("M12.0 4.0 a9.0 9.0 0 1 0 0 18.0 a9.0 9.0 0 1 0 0 -18.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 13L12 13L9 13"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
            ),
        )
        return _alarmRemove!!
    }

private var _alarmRemove: SolarIcon? = null
