package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Import: SolarIcon
    get() {
        if (_import != null) return _import!!
        _import = SolarIcon(
            name = "Solar.LineDuotone.Import",
            secondaryPaths = listOf(
                IconPath("M4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12"),
            ),
            primaryPaths = listOf(
                IconPath("M12 4L12 14M12 14L15 11M12 14L9 11"),
            ),
        )
        return _import!!
    }

private var _import: SolarIcon? = null
