package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RoundArrowLeftDown: SolarIcon
    get() {
        if (_roundArrowLeftDown != null) return _roundArrowLeftDown!!
        _roundArrowLeftDown = SolarIcon(
            name = "Solar.Broken.RoundArrowLeftDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 9L9 15M9 15L9 10.5M9 15L13.5 15"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _roundArrowLeftDown!!
    }

private var _roundArrowLeftDown: SolarIcon? = null
