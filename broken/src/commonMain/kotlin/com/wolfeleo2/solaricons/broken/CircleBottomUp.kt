package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CircleBottomUp: SolarIcon
    get() {
        if (_circleBottomUp != null) return _circleBottomUp!!
        _circleBottomUp = SolarIcon(
            name = "Solar.Broken.CircleBottomUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 21L11 13M11 13H5M11 13V19"),
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 10.1786 21.513 8.47087 20.6622 7M2 12C2 6.47715 6.47715 2 12 2C13.8214 2 15.5291 2.48697 17 3.33782"),
            ),
        )
        return _circleBottomUp!!
    }

private var _circleBottomUp: SolarIcon? = null
