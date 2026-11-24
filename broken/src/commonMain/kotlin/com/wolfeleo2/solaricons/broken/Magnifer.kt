package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Magnifer: SolarIcon
    get() {
        if (_magnifer != null) return _magnifer!!
        _magnifer = SolarIcon(
            name = "Solar.Broken.Magnifer",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18.5 18.5L22 22"),
                IconPath("M6.75 3.27093C8.14732 2.46262 9.76964 2 11.5 2C16.7467 2 21 6.25329 21 11.5C21 16.7467 16.7467 21 11.5 21C6.25329 21 2 16.7467 2 11.5C2 9.76964 2.46262 8.14732 3.27093 6.75"),
            ),
        )
        return _magnifer!!
    }

private var _magnifer: SolarIcon? = null
