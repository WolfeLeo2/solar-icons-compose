package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ListUp: SolarIcon
    get() {
        if (_listUp != null) return _listUp!!
        _listUp = SolarIcon(
            name = "Solar.Broken.ListUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 18L17.5 15L21 18"),
                IconPath("M11 14L3 14"),
                IconPath("M11 18H3"),
                IconPath("M3 6L13.5 6M20 6L17.75 6"),
                IconPath("M20 10L9.5 10M3 10H5.25"),
            ),
        )
        return _listUp!!
    }

private var _listUp: SolarIcon? = null
