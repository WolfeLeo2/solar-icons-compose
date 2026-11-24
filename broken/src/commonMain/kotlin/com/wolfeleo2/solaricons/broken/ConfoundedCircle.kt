package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ConfoundedCircle: SolarIcon
    get() {
        if (_confoundedCircle != null) return _confoundedCircle!!
        _confoundedCircle = SolarIcon(
            name = "Solar.Broken.ConfoundedCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 12L10 10.5L8 9"),
                IconPath("M16 12L14 10.5L16 9"),
                IconPath("M15 16L14 15L13 16L12 15L11 16L10 15L9 16"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _confoundedCircle!!
    }

private var _confoundedCircle: SolarIcon? = null
