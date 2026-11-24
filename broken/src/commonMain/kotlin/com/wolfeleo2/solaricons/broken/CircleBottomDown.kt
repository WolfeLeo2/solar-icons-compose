package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CircleBottomDown: SolarIcon
    get() {
        if (_circleBottomDown != null) return _circleBottomDown!!
        _circleBottomDown = SolarIcon(
            name = "Solar.Broken.CircleBottomDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 14L2 22M2 22H8M2 22V16"),
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 10.1786 21.513 8.47087 20.6622 7M2 12C2 6.47715 6.47715 2 12 2C13.8214 2 15.5291 2.48697 17 3.33782"),
            ),
        )
        return _circleBottomDown!!
    }

private var _circleBottomDown: SolarIcon? = null
