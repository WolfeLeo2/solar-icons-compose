package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Skateboard: SolarIcon
    get() {
        if (_skateboard != null) return _skateboard!!
        _skateboard = SolarIcon(
            name = "Solar.LineDuotone.Skateboard",
            secondaryPaths = listOf(
                IconPath("M2 7L2.81253 8.2188C3.5544 9.3316 4.80332 10 6.14073 10H17.8593C19.1967 10 20.4456 9.33159 21.1875 8.2188L22 7"),
            ),
            primaryPaths = listOf(
                IconPath("M7.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M17.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _skateboard!!
    }

private var _skateboard: SolarIcon? = null
