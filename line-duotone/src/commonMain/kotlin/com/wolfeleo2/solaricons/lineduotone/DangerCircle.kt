package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DangerCircle: SolarIcon
    get() {
        if (_dangerCircle != null) return _dangerCircle!!
        _dangerCircle = SolarIcon(
            name = "Solar.LineDuotone.DangerCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 7V13"),
                IconPath("M12.0 15.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
            ),
        )
        return _dangerCircle!!
    }

private var _dangerCircle: SolarIcon? = null
