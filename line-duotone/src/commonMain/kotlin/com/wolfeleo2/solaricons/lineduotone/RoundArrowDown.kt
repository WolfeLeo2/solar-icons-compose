package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundArrowDown: SolarIcon
    get() {
        if (_roundArrowDown != null) return _roundArrowDown!!
        _roundArrowDown = SolarIcon(
            name = "Solar.LineDuotone.RoundArrowDown",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 8L12 16M12 16L15 13M12 16L9 13"),
            ),
        )
        return _roundArrowDown!!
    }

private var _roundArrowDown: SolarIcon? = null
