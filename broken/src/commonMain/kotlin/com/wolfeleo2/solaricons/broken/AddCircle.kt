package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.AddCircle: SolarIcon
    get() {
        if (_addCircle != null) return _addCircle!!
        _addCircle = SolarIcon(
            name = "Solar.Broken.AddCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 12L12 12M12 12L9 12M12 12L12 9M12 12L12 15"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _addCircle!!
    }

private var _addCircle: SolarIcon? = null
