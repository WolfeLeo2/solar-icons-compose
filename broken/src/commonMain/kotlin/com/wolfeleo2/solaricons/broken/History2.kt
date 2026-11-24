package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.History2: SolarIcon
    get() {
        if (_history2 != null) return _history2!!
        _history2 = SolarIcon(
            name = "Solar.Broken.History2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 17.5228 6.47715 22 12 22C13.8214 22 15.5291 21.513 17 20.6622M12 2C17.5228 2 22 6.47715 22 12C22 13.8214 21.513 15.5291 20.6622 17"),
                IconPath("M12 9V13H16"),
                IconPath("M17 20.6622C15.5291 21.513 13.8214 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 13.8214 21.513 15.5291 20.6622 17"),
            ),
        )
        return _history2!!
    }

private var _history2: SolarIcon? = null
