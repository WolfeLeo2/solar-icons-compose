package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Export: SolarIcon
    get() {
        if (_export != null) return _export!!
        _export = SolarIcon(
            name = "Solar.LineDuotone.Export",
            secondaryPaths = listOf(
                IconPath("M4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12"),
            ),
            primaryPaths = listOf(
                IconPath("M12 14L12 4M12 4L15 7M12 4L9 7"),
            ),
        )
        return _export!!
    }

private var _export: SolarIcon? = null
