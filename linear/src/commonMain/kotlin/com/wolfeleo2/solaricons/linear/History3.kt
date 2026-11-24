package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.History3: SolarIcon
    get() {
        if (_history3 != null) return _history3!!
        _history3 = SolarIcon(
            name = "Solar.Linear.History3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12Z"),
                IconPath("M22 12C22 6.47715 17.5228 2 12 2"),
                IconPath("M12 9V13H16"),
            ),
        )
        return _history3!!
    }

private var _history3: SolarIcon? = null
