package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RecordMinimalistic: SolarIcon
    get() {
        if (_recordMinimalistic != null) return _recordMinimalistic!!
        _recordMinimalistic = SolarIcon(
            name = "Solar.Broken.RecordMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21 11.5C21 13.433 19.433 15 17.5 15C15.567 15 14 13.433 14 11.5C14 9.567 15.567 8 17.5 8"),
                IconPath("M10 11.5C10 13.433 8.433 15 6.5 15C4.567 15 3 13.433 3 11.5C3 9.567 4.567 8 6.5 8C8.433 8 10 9.567 10 11.5Z"),
                IconPath("M6.5 15H17.5"),
            ),
        )
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: SolarIcon? = null
