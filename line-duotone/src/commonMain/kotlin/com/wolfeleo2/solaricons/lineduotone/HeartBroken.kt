package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.HeartBroken: SolarIcon
    get() {
        if (_heartBroken != null) return _heartBroken!!
        _heartBroken = SolarIcon(
            name = "Solar.LineDuotone.HeartBroken",
            secondaryPaths = listOf(
                IconPath("M12 5.50098L10.5 8.50034L14 11.0003L11 14.5003L13 16.5003L12 20.5003"),
            ),
            primaryPaths = listOf(
                IconPath("M2 9.13734C2 14.0003 6.01943 16.5917 8.96173 18.9111C10 19.7296 11 20.5002 12 20.5002C13 20.5002 14 19.7296 15.0383 18.9111C17.9806 16.5917 22 14.0003 22 9.13734C22 4.27441 16.4998 0.825708 12 5.50088C7.50016 0.825708 2 4.27441 2 9.13734Z"),
            ),
        )
        return _heartBroken!!
    }

private var _heartBroken: SolarIcon? = null
