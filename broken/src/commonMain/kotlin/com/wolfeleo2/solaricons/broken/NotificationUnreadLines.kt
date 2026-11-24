package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.NotificationUnreadLines: SolarIcon
    get() {
        if (_notificationUnreadLines != null) return _notificationUnreadLines!!
        _notificationUnreadLines = SolarIcon(
            name = "Solar.Broken.NotificationUnreadLines",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19.0 2.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M7 14H16"),
                IconPath("M7 17.5H13"),
                IconPath("M2 12C2 16.714 2 19.0711 3.46447 20.5355C4.92893 22 7.28595 22 12 22C16.714 22 19.0711 22 20.5355 20.5355C22 19.0711 22 16.714 22 12V10.5M13.5 2H12C7.28595 2 4.92893 2 3.46447 3.46447C2.49073 4.43821 2.16444 5.80655 2.0551 8"),
            ),
        )
        return _notificationUnreadLines!!
    }

private var _notificationUnreadLines: SolarIcon? = null
