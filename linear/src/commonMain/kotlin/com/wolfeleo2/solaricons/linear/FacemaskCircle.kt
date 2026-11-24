package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.FacemaskCircle: SolarIcon
    get() {
        if (_facemaskCircle != null) return _facemaskCircle!!
        _facemaskCircle = SolarIcon(
            name = "Solar.Linear.FacemaskCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
                IconPath("M16.5 20.5001L17 15.0001L13.857 13.7429C12.6649 13.266 11.3351 13.266 10.143 13.7429L7 15.0001L7.5 20.5001"),
                IconPath("M7 15L2.5 13"),
                IconPath("M17 15L21.5 13"),
            ),
        )
        return _facemaskCircle!!
    }

private var _facemaskCircle: SolarIcon? = null
