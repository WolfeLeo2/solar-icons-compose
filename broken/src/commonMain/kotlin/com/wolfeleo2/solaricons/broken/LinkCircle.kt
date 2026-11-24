package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.LinkCircle: SolarIcon
    get() {
        if (_linkCircle != null) return _linkCircle!!
        _linkCircle = SolarIcon(
            name = "Solar.Broken.LinkCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 12C14 15.3137 11.3137 18 8 18C4.68629 18 2 15.3137 2 12C2 8.68629 4.68629 6 8 6"),
                IconPath("M10 12C10 8.68629 12.6863 6 16 6M16 18C19.3137 18 22 15.3137 22 12C22 10.7733 21.6318 9.63251 21 8.68221"),
            ),
        )
        return _linkCircle!!
    }

private var _linkCircle: SolarIcon? = null
