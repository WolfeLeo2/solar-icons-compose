package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Reorder: SolarIcon
    get() {
        if (_reorder != null) return _reorder!!
        _reorder = SolarIcon(
            name = "Solar.Broken.Reorder",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 10L11 10M5 10H7"),
                IconPath("M5 18H13M19 18H17"),
                IconPath("M19 14L5 14"),
                IconPath("M19 6L5 6"),
            ),
        )
        return _reorder!!
    }

private var _reorder: SolarIcon? = null
