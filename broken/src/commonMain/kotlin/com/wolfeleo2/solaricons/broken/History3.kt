package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.History3: SolarIcon
    get() {
        if (_history3 != null) return _history3!!
        _history3 = SolarIcon(
            name = "Solar.Broken.History3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 3.33782C15.5291 2.48697 13.8214 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 10.5778 21.7031 9.22492 21.1679 8"),
                IconPath("M22 12C22 10.1786 21.513 8.47087 20.6622 7M12 2C13.8214 2 15.5291 2.48697 17 3.33782"),
                IconPath("M12 9V13H16"),
            ),
        )
        return _history3!!
    }

private var _history3: SolarIcon? = null
