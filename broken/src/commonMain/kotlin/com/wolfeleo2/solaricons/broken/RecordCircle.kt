package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RecordCircle: SolarIcon
    get() {
        if (_recordCircle != null) return _recordCircle!!
        _recordCircle = SolarIcon(
            name = "Solar.Broken.RecordCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
                IconPath("M16 12C16 14.2091 14.2091 16 12 16C9.79086 16 8 14.2091 8 12C8 9.79086 9.79086 8 12 8C12.7286 8 13.4117 8.19479 14 8.53513"),
            ),
        )
        return _recordCircle!!
    }

private var _recordCircle: SolarIcon? = null
