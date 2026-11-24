package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.UploadMinimalistic: SolarIcon
    get() {
        if (_uploadMinimalistic != null) return _uploadMinimalistic!!
        _uploadMinimalistic = SolarIcon(
            name = "Solar.Broken.UploadMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15 21H9C6.17157 21 4.75736 21 3.87868 20.1213C3 19.2426 3 17.8284 3 15M21 15C21 17.8284 21 19.2426 20.1213 20.1213C19.8215 20.4211 19.4594 20.6186 19 20.7487"),
                IconPath("M12 16V3M12 3L16 7.375M12 3L8 7.375"),
            ),
        )
        return _uploadMinimalistic!!
    }

private var _uploadMinimalistic: SolarIcon? = null
