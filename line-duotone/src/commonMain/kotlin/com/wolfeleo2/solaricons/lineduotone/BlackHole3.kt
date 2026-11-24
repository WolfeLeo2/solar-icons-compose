package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BlackHole3: SolarIcon
    get() {
        if (_blackHole3 != null) return _blackHole3!!
        _blackHole3 = SolarIcon(
            name = "Solar.LineDuotone.BlackHole3",
            secondaryPaths = listOf(
                IconPath("M12 10C17 10 16.6 22 9 22"),
                IconPath("M12.3115 14C7.31152 14 7.71152 2 15.3115 2"),
                IconPath("M10 12.3115C10 7.31152 22 7.71152 22 15.3115"),
                IconPath("M14 12C14 17 2 16.6 2 9"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _blackHole3!!
    }

private var _blackHole3: SolarIcon? = null
