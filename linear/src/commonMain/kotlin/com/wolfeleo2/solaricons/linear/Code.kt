package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Code: SolarIcon
    get() {
        if (_code != null) return _code!!
        _code = SolarIcon(
            name = "Solar.Linear.Code",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 7.82959L18.6965 9.35641C20.239 10.7447 21.0103 11.4389 21.0103 12.3296C21.0103 13.2203 20.239 13.9145 18.6965 15.3028L17 16.8296"),
                IconPath("M13.9868 5L12 12.4149L10.0132 19.8297"),
                IconPath("M6.99999 7.82959L5.30352 9.35641C3.76096 10.7447 2.98969 11.4389 2.98969 12.3296C2.98969 13.2203 3.76096 13.9145 5.30352 15.3028L6.99999 16.8296"),
            ),
        )
        return _code!!
    }

private var _code: SolarIcon? = null
