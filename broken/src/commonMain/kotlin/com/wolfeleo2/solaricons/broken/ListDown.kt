package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListDown: SolarIcon
    get() {
        if (_listDown != null) return _listDown!!
        _listDown = SolarIcon(
            name = "Solar.Broken.ListDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 14H3"),
                IconPath("M10 18H3"),
                IconPath("M14 15L17.5 18L21 15"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listDown!!
    }

private var _listDown: SolarIcon? = null
