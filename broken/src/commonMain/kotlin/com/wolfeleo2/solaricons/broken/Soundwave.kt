package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Soundwave: SolarIcon
    get() {
        if (_soundwave != null) return _soundwave!!
        _soundwave = SolarIcon(
            name = "Solar.Broken.Soundwave",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4L12 20"),
                IconPath("M16 7L16 9M16 17L16 13"),
                IconPath("M8 17L8 15M8 7L8 11"),
                IconPath("M20 11L20 13"),
                IconPath("M4 11L4 13"),
            ),
        )
        return _soundwave!!
    }

private var _soundwave: SolarIcon? = null
