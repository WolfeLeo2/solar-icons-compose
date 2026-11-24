package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.AltArrowDown: SolarIcon
    get() {
        if (_altArrowDown != null) return _altArrowDown!!
        _altArrowDown = SolarIcon(
            name = "Solar.LineDuotone.AltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 9L12 15L5 9"),
            ),
        )
        return _altArrowDown!!
    }

private var _altArrowDown: SolarIcon? = null
