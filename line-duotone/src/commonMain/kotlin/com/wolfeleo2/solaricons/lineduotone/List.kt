package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.List: SolarIcon
    get() {
        if (_list != null) return _list!!
        _list = SolarIcon(
            name = "Solar.LineDuotone.List",
            secondaryPaths = listOf(
                IconPath("M4 17H11"),
                IconPath("M4 12L11 12"),
                IconPath("M4 7L11 7"),
            ),
            primaryPaths = listOf(
                IconPath("M17 4L17 20M17 4L14 8M17 4L20 8M17 20L20 16M17 20L14 16"),
            ),
        )
        return _list!!
    }

private var _list: SolarIcon? = null
