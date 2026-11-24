package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Unread: SolarIcon
    get() {
        if (_unread != null) return _unread!!
        _unread = SolarIcon(
            name = "Solar.Broken.Unread",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 12.9L10.1429 16.5L12.1071 14.25M18 7.5L14.0714 12"),
            ),
        )
        return _unread!!
    }

private var _unread: SolarIcon? = null
