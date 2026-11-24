package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CheckRead: SolarIcon
    get() {
        if (_checkRead != null) return _checkRead!!
        _checkRead = SolarIcon(
            name = "Solar.LineDuotone.CheckRead",
            secondaryPaths = listOf(
                IconPath("M4 12.9L7.14286 16.5L15 7.5"),
            ),
            primaryPaths = listOf(
                IconPath("M20.0002 7.5625L11.4286 16.5625L11.0002 16"),
            ),
        )
        return _checkRead!!
    }

private var _checkRead: SolarIcon? = null
