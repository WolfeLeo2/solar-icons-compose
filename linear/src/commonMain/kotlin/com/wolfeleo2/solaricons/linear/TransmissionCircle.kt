package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TransmissionCircle: SolarIcon
    get() {
        if (_transmissionCircle != null) return _transmissionCircle!!
        _transmissionCircle = SolarIcon(
            name = "Solar.Linear.TransmissionCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 9V15"),
                IconPath("M12 9V15"),
                IconPath("M8 12H13C13.9319 12 14.3978 12 14.7654 11.8478C15.2554 11.6448 15.6448 11.2554 15.8478 10.7654C16 10.3978 16 9.93188 16 9"),
                IconPath("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12Z"),
            ),
        )
        return _transmissionCircle!!
    }

private var _transmissionCircle: SolarIcon? = null
