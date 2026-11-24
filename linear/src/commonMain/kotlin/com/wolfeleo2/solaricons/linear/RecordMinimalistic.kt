package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RecordMinimalistic: SolarIcon
    get() {
        if (_recordMinimalistic != null) return _recordMinimalistic!!
        _recordMinimalistic = SolarIcon(
            name = "Solar.Linear.RecordMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 14.2091 20.2091 16 18 16C15.7909 16 14 14.2091 14 12C14 9.79086 15.7909 8 18 8C20.2091 8 22 9.79086 22 12Z"),
                IconPath("M10 12C10 14.2091 8.20914 16 6 16C3.79086 16 2 14.2091 2 12C2 9.79086 3.79086 8 6 8C8.20914 8 10 9.79086 10 12Z"),
                IconPath("M6 16H18"),
            ),
        )
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: SolarIcon? = null
