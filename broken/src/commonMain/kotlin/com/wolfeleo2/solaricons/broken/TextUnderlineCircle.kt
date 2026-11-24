package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TextUnderlineCircle: SolarIcon
    get() {
        if (_textUnderlineCircle != null) return _textUnderlineCircle!!
        _textUnderlineCircle = SolarIcon(
            name = "Solar.Broken.TextUnderlineCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 17H16"),
                IconPath("M8 7V10C8 12.2091 9.79086 14 12 14C14.2091 14 16 12.2091 16 10V7"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _textUnderlineCircle!!
    }

private var _textUnderlineCircle: SolarIcon? = null
