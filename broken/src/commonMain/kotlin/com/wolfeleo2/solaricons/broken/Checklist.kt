package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Checklist: SolarIcon
    get() {
        if (_checklist != null) return _checklist!!
        _checklist = SolarIcon(
            name = "Solar.Broken.Checklist",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 5.5L3.21429 7L7.5 3"),
                IconPath("M2 12.5L3.21429 14L7.5 10"),
                IconPath("M2 19.5L3.21429 21L7.5 17"),
                IconPath("M22 12H17M12 12H13.5"),
                IconPath("M12 19H17M20.5 19H22"),
                IconPath("M22 5L12 5"),
            ),
        )
        return _checklist!!
    }

private var _checklist: SolarIcon? = null
