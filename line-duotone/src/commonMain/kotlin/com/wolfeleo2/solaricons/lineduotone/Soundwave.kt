package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Soundwave: SolarIcon
    get() {
        if (_soundwave != null) return _soundwave!!
        _soundwave = SolarIcon(
            name = "Solar.LineDuotone.Soundwave",
            secondaryPaths = listOf(
                IconPath("M16 7L16 17"),
                IconPath("M8 7L8 17"),
            ),
            primaryPaths = listOf(
                IconPath("M12 4L12 20"),
                IconPath("M20 11L20 13"),
                IconPath("M4 11L4 13"),
            ),
        )
        return _soundwave!!
    }

private var _soundwave: SolarIcon? = null
