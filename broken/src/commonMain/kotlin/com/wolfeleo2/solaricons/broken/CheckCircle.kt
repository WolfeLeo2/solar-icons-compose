package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CheckCircle: SolarIcon
    get() {
        if (_checkCircle != null) return _checkCircle!!
        _checkCircle = SolarIcon(
            name = "Solar.Broken.CheckCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8.5 12.5L10.5 14.5L15.5 9.5"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _checkCircle!!
    }

private var _checkCircle: SolarIcon? = null
