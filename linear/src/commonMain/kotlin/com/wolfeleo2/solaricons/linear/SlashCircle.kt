package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SlashCircle: SolarIcon
    get() {
        if (_slashCircle != null) return _slashCircle!!
        _slashCircle = SolarIcon(
            name = "Solar.Linear.SlashCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13.2939 7.17041L11.9998 12L10.7058 16.8297"),
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
        )
        return _slashCircle!!
    }

private var _slashCircle: SolarIcon? = null
