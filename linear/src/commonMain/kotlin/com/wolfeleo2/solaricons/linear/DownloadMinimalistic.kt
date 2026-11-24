package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.DownloadMinimalistic: SolarIcon
    get() {
        if (_downloadMinimalistic != null) return _downloadMinimalistic!!
        _downloadMinimalistic = SolarIcon(
            name = "Solar.Linear.DownloadMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 15C3 17.8284 3 19.2426 3.87868 20.1213C4.75736 21 6.17157 21 9 21H15C17.8284 21 19.2426 21 20.1213 20.1213C21 19.2426 21 17.8284 21 15"),
                IconPath("M12 3V16M12 16L16 11.625M12 16L8 11.625"),
            ),
        )
        return _downloadMinimalistic!!
    }

private var _downloadMinimalistic: SolarIcon? = null
