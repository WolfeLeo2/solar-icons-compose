package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Skateboard: SolarIcon
    get() {
        if (_skateboard != null) return _skateboard!!
        _skateboard = SolarIcon(
            name = "Solar.Broken.Skateboard",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 7L2.81253 8.2188C3.5544 9.3316 4.80332 10 6.14073 10H12M22 7L21.1875 8.2188C20.4456 9.33159 19.1967 10 17.8593 10H16"),
                IconPath("M7.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M17.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _skateboard!!
    }

private var _skateboard: SolarIcon? = null
