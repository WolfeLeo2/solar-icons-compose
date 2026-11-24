package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.AltArrowDown: SolarIcon
    get() {
        if (_altArrowDown != null) return _altArrowDown!!
        _altArrowDown = SolarIcon(
            name = "Solar.Bold.AltArrowDown",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.3704 15.8351L18.8001 9.20467C19.2013 8.79094 18.9581 8 18.4297 8H5.5703C5.04189 8 4.79869 8.79094 5.1999 9.20467L11.6296 15.8351C11.8427 16.055 12.1573 16.0549 12.3704 15.8351Z"),
            ),
        )
        return _altArrowDown!!
    }

private var _altArrowDown: SolarIcon? = null
