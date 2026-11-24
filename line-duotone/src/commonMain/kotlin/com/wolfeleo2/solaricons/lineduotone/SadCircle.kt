package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SadCircle: SolarIcon
    get() {
        if (_sadCircle != null) return _sadCircle!!
        _sadCircle = SolarIcon(
            name = "Solar.LineDuotone.SadCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 17C9.85038 16.3697 10.8846 16 12 16C13.1154 16 14.1496 16.3697 15 17"),
            ),
        )
        return _sadCircle!!
    }

private var _sadCircle: SolarIcon? = null
