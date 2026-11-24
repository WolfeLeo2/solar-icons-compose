package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CheckCircle: SolarIcon
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = SolarIcon(
            name = "Solar.LineDuotone.CheckCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M8.5 12.5L10.5 14.5L15.5 9.5"),
            ),
        )
        return _checkCircle!!
    }

private var _checkCircle: SolarIcon? = null
