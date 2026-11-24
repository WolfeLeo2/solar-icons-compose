package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Import: SolarIcon
    get() {
        if (_import != null) return _import!!
        _import = SolarIcon(
            name = "Solar.Linear.Import",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12"),
                IconPath("M12 4L12 14M12 14L15 11M12 14L9 11"),
            ),
        )
        return _import!!
    }

private var _import: SolarIcon? = null
