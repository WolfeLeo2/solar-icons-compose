package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Mouse: SolarIcon
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = SolarIcon(
            name = "Solar.Broken.Mouse",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 15C19 18.866 15.866 22 12 22C8.13401 22 5 18.866 5 15V9C5 5.13401 8.13401 2 12 2C15.866 2 19 5.13401 19 9V11"),
                IconPath("M10.5 8.5C10.5 7.67157 11.1716 7 12 7C12.8284 7 13.5 7.67157 13.5 8.5V10.5C13.5 11.3284 12.8284 12 12 12C11.1716 12 10.5 11.3284 10.5 10.5V8.5Z"),
                IconPath("M12 2V7"),
            ),
        )
        return _mouse!!
    }

private var _mouse: SolarIcon? = null
