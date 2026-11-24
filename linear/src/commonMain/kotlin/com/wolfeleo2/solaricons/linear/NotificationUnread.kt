package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.NotificationUnread: SolarIcon
    get() {
        if (_notificationUnread != null) return _notificationUnread!!
        _notificationUnread = SolarIcon(
            name = "Solar.Linear.NotificationUnread",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 10.5V12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2H13.5"),
                IconPath("M19.0 2.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
            ),
        )
        return _notificationUnread!!
    }

private var _notificationUnread: SolarIcon? = null
