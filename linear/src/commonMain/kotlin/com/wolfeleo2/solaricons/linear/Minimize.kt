package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Minimize: SolarIcon
    get() {
        if (_minimize != null) return _minimize!!
        _minimize = SolarIcon(
            name = "Solar.Linear.Minimize",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 22L9 15M9 15H3.14286M9 15V20.8571"),
                IconPath("M22 2L15 9M15 9H20.8571M15 9V3.14286"),
            ),
        )
        return _minimize!!
    }

private var _minimize: SolarIcon? = null
