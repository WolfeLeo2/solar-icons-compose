package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.NotificationUnreadLines: SolarIcon
    get() {
        if (_notificationUnreadLines != null) return _notificationUnreadLines!!
        _notificationUnreadLines = SolarIcon(
            name = "Solar.LineDuotone.NotificationUnreadLines",
            secondaryPaths = listOf(
                IconPath("M22 10.5V12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2H13.5"),
            ),
            primaryPaths = listOf(
                IconPath("M19.0 2.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M7 14H16"),
                IconPath("M7 17.5H13"),
            ),
        )
        return _notificationUnreadLines!!
    }

private var _notificationUnreadLines: SolarIcon? = null
