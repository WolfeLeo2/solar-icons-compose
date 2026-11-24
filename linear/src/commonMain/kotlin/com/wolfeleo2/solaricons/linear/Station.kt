package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Station: SolarIcon
    get() {
        if (_station != null) return _station!!
        _station = SolarIcon(
            name = "Solar.Linear.Station",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19.1414 2.07816C20.9097 3.88191 22 6.3527 22 9.07816C22 11.836 20.8836 14.333 19.0782 16.1421M5 16.2196C3.14864 14.4047 2 11.8756 2 9.07816C2 6.31313 3.12222 3.8102 4.93603 2"),
                IconPath("M16.2849 5.1221C17.3458 6.13689 18 7.52697 18 9.06033C18 10.6119 17.3302 12.0167 16.2469 13.0345M7.8 13.0781C6.68918 12.057 6 10.6342 6 9.06033C6 7.50471 6.67333 6.09655 7.76162 5.07812"),
                IconPath("M12.0 7.07812 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M12.5 11L16 22L10.5 15.5M11.5 11L8 22L13.5 15.5"),
            ),
        )
        return _station!!
    }

private var _station: SolarIcon? = null
