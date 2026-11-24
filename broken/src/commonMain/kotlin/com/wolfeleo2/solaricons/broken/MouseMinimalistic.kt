package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.MouseMinimalistic: SolarIcon
    get() {
        if (_mouseMinimalistic != null) return _mouseMinimalistic!!
        _mouseMinimalistic = SolarIcon(
            name = "Solar.Broken.MouseMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 15C19 18.866 15.866 22 12 22C8.13401 22 5 18.866 5 15V9C5 5.13401 8.13401 2 12 2C15.866 2 19 5.13401 19 9V11"),
                IconPath("M12 5V8"),
            ),
        )
        return _mouseMinimalistic!!
    }

private var _mouseMinimalistic: SolarIcon? = null
