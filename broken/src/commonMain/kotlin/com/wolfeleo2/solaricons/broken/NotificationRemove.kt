package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.NotificationRemove: SolarIcon
    get() {
        if (_notificationRemove != null) return _notificationRemove!!
        _notificationRemove = SolarIcon(
            name = "Solar.Broken.NotificationRemove",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 2L17 6.99998M17 1.99998L22 6.99996"),
                IconPath("M2 12C2 16.714 2 19.0711 3.46447 20.5355C4.92893 22 7.28595 22 12 22C16.714 22 19.0711 22 20.5355 20.5355C22 19.0711 22 16.714 22 12V10.5M13.5 2H12C7.28595 2 4.92893 2 3.46447 3.46447C2.49073 4.43821 2.16444 5.80655 2.0551 8"),
            ),
        )
        return _notificationRemove!!
    }

private var _notificationRemove: SolarIcon? = null
