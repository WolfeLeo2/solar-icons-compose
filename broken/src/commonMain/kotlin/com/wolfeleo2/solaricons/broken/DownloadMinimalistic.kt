package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.DownloadMinimalistic: SolarIcon
    get() {
        if (_downloadMinimalistic != null) return _downloadMinimalistic!!
        _downloadMinimalistic = SolarIcon(
            name = "Solar.Broken.DownloadMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 3V16M12 16L16 11.625M12 16L8 11.625"),
                IconPath("M15 21H9C6.17157 21 4.75736 21 3.87868 20.1213C3 19.2426 3 17.8284 3 15M21 15C21 17.8284 21 19.2426 20.1213 20.1213C19.8215 20.4211 19.4594 20.6186 19 20.7487"),
            ),
        )
        return _downloadMinimalistic!!
    }

private var _downloadMinimalistic: SolarIcon? = null
