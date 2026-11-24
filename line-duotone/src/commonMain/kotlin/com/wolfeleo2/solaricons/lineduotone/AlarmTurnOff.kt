package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.AlarmTurnOff: SolarIcon
    get() {
        if (_alarmTurnOff != null) return _alarmTurnOff!!
        _alarmTurnOff = SolarIcon(
            name = "Solar.LineDuotone.AlarmTurnOff",
            secondaryPaths = listOf(
                IconPath("M12.0 4.0 a9.0 9.0 0 1 0 0 18.0 a9.0 9.0 0 1 0 0 -18.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M14.1213 15.1213L12 13M12 13L9.87866 10.8787M12 13L14.1213 10.8787M12 13L9.87868 15.1213"),
                IconPath("M3.5 4.5L7.50002 2"),
                IconPath("M20.5 4.5L16.5 2"),
            ),
        )
        return _alarmTurnOff!!
    }

private var _alarmTurnOff: SolarIcon? = null
