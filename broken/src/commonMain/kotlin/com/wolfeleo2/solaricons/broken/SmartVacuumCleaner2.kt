package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SmartVacuumCleaner2: SolarIcon
    get() {
        if (_smartVacuumCleaner2 != null) return _smartVacuumCleaner2!!
        _smartVacuumCleaner2 = SolarIcon(
            name = "Solar.Broken.SmartVacuumCleaner2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 9C15 7.34315 13.6569 6 12 6C10.3431 6 9 7.34315 9 9C9 10.6569 10.3431 12 12 12"),
                IconPath("M12 18V16"),
                IconPath("M2 22L4.5 19.5"),
                IconPath("M22 22L19.5 19.5"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _smartVacuumCleaner2!!
    }

private var _smartVacuumCleaner2: SolarIcon? = null
