package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.AddCircle: SolarIcon
    get() {
        if (_addCircle != null) return _addCircle!!
        _addCircle = SolarIcon(
            name = "Solar.LineDuotone.AddCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M15 12L12 12M12 12L9 12M12 12L12 9M12 12L12 15"),
            ),
        )
        return _addCircle!!
    }

private var _addCircle: SolarIcon? = null
