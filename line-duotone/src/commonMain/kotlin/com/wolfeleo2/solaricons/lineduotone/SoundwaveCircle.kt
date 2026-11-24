package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SoundwaveCircle: SolarIcon
    get() {
        if (_soundwaveCircle != null) return _soundwaveCircle!!
        _soundwaveCircle = SolarIcon(
            name = "Solar.LineDuotone.SoundwaveCircle",
            secondaryPaths = listOf(
                IconPath("M2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 7L12 17"),
                IconPath("M17 10L17 14"),
                IconPath("M7 9L7 15"),
            ),
        )
        return _soundwaveCircle!!
    }

private var _soundwaveCircle: SolarIcon? = null
