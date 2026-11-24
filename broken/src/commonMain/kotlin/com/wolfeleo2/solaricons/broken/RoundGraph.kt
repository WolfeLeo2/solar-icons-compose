package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RoundGraph: SolarIcon
    get() {
        if (_roundGraph != null) return _roundGraph!!
        _roundGraph = SolarIcon(
            name = "Solar.Broken.RoundGraph",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2C17.5228 2 22 6.47715 22 12C22 13.8214 21.513 15.5291 20.6622 17M5 4.85857C3.14864 6.67349 2 9.20261 2 12C2 17.5228 6.47715 22 12 22C13.8214 22 15.5291 21.513 17 20.6622"),
                IconPath("M5 12C5 13.4872 5.46381 14.8662 6.25469 16M12 5C15.866 5 19 8.13401 19 12C19 15.866 15.866 19 12 19C10.9264 19 9.90926 18.7583 9 18.3264"),
                IconPath("M12 16C14.2091 16 16 14.2091 16 12C16 9.79086 14.2091 8 12 8"),
            ),
        )
        return _roundGraph!!
    }

private var _roundGraph: SolarIcon? = null
