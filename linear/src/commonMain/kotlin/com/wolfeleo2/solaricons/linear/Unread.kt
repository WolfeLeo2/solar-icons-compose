package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Unread: SolarIcon
    get() {
        if (_unread != null) return _unread!!
        _unread = SolarIcon(
            name = "Solar.Linear.Unread",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 12.9L10.1429 16.5L18 7.5"),
            ),
        )
        return _unread!!
    }

private var _unread: SolarIcon? = null
