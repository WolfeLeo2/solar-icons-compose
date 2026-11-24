package com.wolfeleo2.solaricons.outline

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Outline.Record: SolarIcon
    get() {
        if (_record != null) return _record!!
        _record = SolarIcon(
            name = "Solar.Outline.Record",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2.75C6.89137 2.75 2.75 6.89137 2.75 12C2.75 17.1086 6.89137 21.25 12 21.25C17.1086 21.25 21.25 17.1086 21.25 12C21.25 6.89137 17.1086 2.75 12 2.75ZM1.25 12C1.25 6.06294 6.06294 1.25 12 1.25C17.9371 1.25 22.75 6.06294 22.75 12C22.75 17.9371 17.9371 22.75 12 22.75C6.06294 22.75 1.25 17.9371 1.25 12Z", PathFillType.EvenOdd),
            ),
        )
        return _record!!
    }

private var _record: SolarIcon? = null
