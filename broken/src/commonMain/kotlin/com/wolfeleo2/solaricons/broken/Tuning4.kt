package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Tuning4: SolarIcon
    get() {
        if (_tuning4 != null) return _tuning4!!
        _tuning4 = SolarIcon(
            name = "Solar.Broken.Tuning4",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 14C10.8954 14 10 13.1046 10 12C10 10.8954 10.8954 10 12 10C13.1046 10 14 10.8954 14 12C14 13.1046 13.1046 14 12 14Z"),
                IconPath("M14 6C12.8954 6 12 5.10457 12 4C12 2.89543 12.8954 2 14 2C15.1046 2 16 2.89543 16 4C16 5.10457 15.1046 6 14 6Z"),
                IconPath("M10 22C11.1046 22 12 21.1046 12 20C12 18.8954 11.1046 18 10 18C8.89543 18 8 18.8954 8 20C8 21.1046 8.89543 22 10 22Z"),
                IconPath("M17.5 20L19 20M12 20L14.75 20"),
                IconPath("M6.5 4L5 4M12 4L9.25 4"),
                IconPath("M19 12H14"),
                IconPath("M19 4L16 4"),
                IconPath("M5 20L7.66667 20"),
                IconPath("M10 12L7.5 12M5.5 12L5 12"),
            ),
        )
        return _tuning4!!
    }

private var _tuning4: SolarIcon? = null
