package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CloseCircle: SolarIcon
    get() {
        if (_closeCircle != null) return _closeCircle!!
        _closeCircle = SolarIcon(
            name = "Solar.LineDuotone.CloseCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M14.5 9.49999L9.5 14.5M9.49998 9.49997L14.5 14.4999"),
            ),
        )
        return _closeCircle!!
    }

private var _closeCircle: SolarIcon? = null
