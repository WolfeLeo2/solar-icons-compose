package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CircleTopDown: SolarIcon
    get() {
        if (_circleTopDown != null) return _circleTopDown!!
        _circleTopDown = SolarIcon(
            name = "Solar.Broken.CircleTopDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 3L12 12M12 12H17.3438M12 12V6.65625"),
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 13.8214 2.48697 15.5291 3.33782 17M22 12C22 17.5228 17.5228 22 12 22C10.1786 22 8.47087 21.513 7 20.6622"),
            ),
        )
        return _circleTopDown!!
    }

private var _circleTopDown: SolarIcon? = null
