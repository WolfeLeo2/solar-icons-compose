package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.ForbiddenCircle: SolarIcon
    get() {
        if (_forbiddenCircle != null) return _forbiddenCircle!!
        _forbiddenCircle = SolarIcon(
            name = "Solar.Bold.ForbiddenCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 9.50853 21.0889 7.22987 19.5816 5.47906L5.47905 19.5816C7.22987 21.0889 9.50853 22 12 22Z"),
                IconPath("M12 2C6.47715 2 2 6.47715 2 12C2 14.4915 2.91114 16.7701 4.41839 18.5209L18.5209 4.41839C16.7701 2.91114 14.4915 2 12 2Z"),
            ),
        )
        return _forbiddenCircle!!
    }

private var _forbiddenCircle: SolarIcon? = null
