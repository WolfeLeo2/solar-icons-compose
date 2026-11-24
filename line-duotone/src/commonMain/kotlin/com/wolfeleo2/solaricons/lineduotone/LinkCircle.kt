package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.LinkCircle: SolarIcon
    get() {
        if (_linkCircle != null) return _linkCircle!!
        _linkCircle = SolarIcon(
            name = "Solar.LineDuotone.LinkCircle",
            secondaryPaths = listOf(
                IconPath("M10 12C10 8.68629 12.6863 6 16 6C19.3137 6 22 8.68629 22 12C22 15.3137 19.3137 18 16 18"),
            ),
            primaryPaths = listOf(
                IconPath("M14 12C14 15.3137 11.3137 18 8 18C4.68629 18 2 15.3137 2 12C2 8.68629 4.68629 6 8 6"),
            ),
        )
        return _linkCircle!!
    }

private var _linkCircle: SolarIcon? = null
