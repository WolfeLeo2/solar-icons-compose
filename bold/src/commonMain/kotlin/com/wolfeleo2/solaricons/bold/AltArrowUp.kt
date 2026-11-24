package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.AltArrowUp: SolarIcon
    get() {
        if (_altArrowUp != null) return _altArrowUp!!
        _altArrowUp = SolarIcon(
            name = "Solar.Bold.AltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.3704 8.16485L18.8001 14.7953C19.2013 15.2091 18.9581 16 18.4297 16H5.5703C5.04189 16 4.79869 15.2091 5.1999 14.7953L11.6296 8.16485C11.8427 7.94505 12.1573 7.94505 12.3704 8.16485Z"),
            ),
        )
        return _altArrowUp!!
    }

private var _altArrowUp: SolarIcon? = null
