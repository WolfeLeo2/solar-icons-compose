package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.LinkMinimalistic: SolarIcon
    get() {
        if (_linkMinimalistic != null) return _linkMinimalistic!!
        _linkMinimalistic = SolarIcon(
            name = "Solar.Broken.LinkMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8.99991 11.9999H14.9999"),
                IconPath("M9 18H8C4.68629 18 2 15.3137 2 12C2 8.68629 4.68629 6 8 6H9"),
                IconPath("M15 6H16C19.3137 6 22 8.68629 22 12M15 18H16C17.2267 18 18.3675 17.6318 19.3178 17"),
            ),
        )
        return _linkMinimalistic!!
    }

private var _linkMinimalistic: SolarIcon? = null
