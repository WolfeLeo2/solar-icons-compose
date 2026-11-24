package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TransmissionSquare: SolarIcon
    get() {
        if (_transmissionSquare != null) return _transmissionSquare!!
        _transmissionSquare = SolarIcon(
            name = "Solar.Linear.TransmissionSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8 9V15"),
                IconPath("M12 9V15"),
                IconPath("M8 12H13C13.9319 12 14.3978 12 14.7654 11.8478C15.2554 11.6448 15.6448 11.2554 15.8478 10.7654C16 10.3978 16 9.93188 16 9"),
            ),
        )
        return _transmissionSquare!!
    }

private var _transmissionSquare: SolarIcon? = null
