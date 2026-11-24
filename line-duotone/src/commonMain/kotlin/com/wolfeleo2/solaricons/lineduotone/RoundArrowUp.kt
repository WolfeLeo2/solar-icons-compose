package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundArrowUp: SolarIcon
    get() {
        if (_roundArrowUp != null) return _roundArrowUp!!
        _roundArrowUp = SolarIcon(
            name = "Solar.LineDuotone.RoundArrowUp",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 16L12 8M12 8L15 11M12 8L9 11"),
            ),
        )
        return _roundArrowUp!!
    }

private var _roundArrowUp: SolarIcon? = null
