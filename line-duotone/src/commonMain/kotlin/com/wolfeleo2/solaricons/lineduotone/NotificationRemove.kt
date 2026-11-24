package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.NotificationRemove: SolarIcon
    get() {
        if (_notificationRemove != null) return _notificationRemove!!
        _notificationRemove = SolarIcon(
            name = "Solar.LineDuotone.NotificationRemove",
            secondaryPaths = listOf(
                IconPath("M22 10.5V12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2H13.5"),
            ),
            primaryPaths = listOf(
                IconPath("M22 2L17 6.99998M17 1.99998L22 6.99996"),
            ),
        )
        return _notificationRemove!!
    }

private var _notificationRemove: SolarIcon? = null
