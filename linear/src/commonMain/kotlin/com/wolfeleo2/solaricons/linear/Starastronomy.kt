package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Starastronomy: SolarIcon
    get() {
        if (_starastronomy != null) return _starastronomy!!
        _starastronomy = SolarIcon(
            name = "Solar.Linear.Starastronomy",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 20V17.6M12 6.4V4M20 12H17.6M6.4 12H4M17.6569 6.34315L15.9598 8.0402M8.0402 15.9598L6.34315 17.6569M6.34293 6.34332L8.03999 8.04038M15.9596 15.96L17.6566 17.657"),
            ),
        )
        return _starastronomy!!
    }

private var _starastronomy: SolarIcon? = null
