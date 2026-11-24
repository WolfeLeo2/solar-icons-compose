package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Wheel: SolarIcon
    get() {
        if (_wheel != null) return _wheel!!
        _wheel = SolarIcon(
            name = "Solar.Linear.Wheel",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M12.0 6.0 a6.0 6.0 0 1 0 0 12.0 a6.0 6.0 0 1 0 0 -12.0z"),
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M6 12L10 12"),
                IconPath("M14 12L18 12"),
                IconPath("M9 17.1963L11 13.7322"),
                IconPath("M13 10.2681L15 6.80396"),
                IconPath("M15 17.1963L13 13.7322"),
                IconPath("M11 10.2681L9 6.80396"),
            ),
        )
        return _wheel!!
    }

private var _wheel: SolarIcon? = null
