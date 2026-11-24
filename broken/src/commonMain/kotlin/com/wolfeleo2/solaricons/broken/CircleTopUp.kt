package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CircleTopUp: SolarIcon
    get() {
        if (_circleTopUp != null) return _circleTopUp!!
        _circleTopUp = SolarIcon(
            name = "Solar.Broken.CircleTopUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375"),
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 13.8214 2.48697 15.5291 3.33782 17M22 12C22 17.5228 17.5228 22 12 22C10.1786 22 8.47087 21.513 7 20.6622"),
            ),
        )
        return _circleTopUp!!
    }

private var _circleTopUp: SolarIcon? = null
