package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SmartVacuumCleaner2: SolarIcon
    get() {
        if (_smartVacuumCleaner2 != null) return _smartVacuumCleaner2!!
        _smartVacuumCleaner2 = SolarIcon(
            name = "Solar.Linear.SmartVacuumCleaner2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12Z"),
                IconPath("M15 9C15 10.6569 13.6569 12 12 12C10.3431 12 9 10.6569 9 9C9 7.34315 10.3431 6 12 6C13.6569 6 15 7.34315 15 9Z"),
                IconPath("M12 18V16"),
                IconPath("M2 22L4.5 19.5"),
                IconPath("M22 22L19.5 19.5"),
            ),
        )
        return _smartVacuumCleaner2!!
    }

private var _smartVacuumCleaner2: SolarIcon? = null
