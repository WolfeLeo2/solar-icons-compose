package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.History2: SolarIcon
    get() {
        if (_history2 != null) return _history2!!
        _history2 = SolarIcon(
            name = "Solar.LineDuotone.History2",
            secondaryPaths = listOf(
                IconPath("M12 9V13H16"),
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2"),
            ),
        )
        return _history2!!
    }

private var _history2: SolarIcon? = null
