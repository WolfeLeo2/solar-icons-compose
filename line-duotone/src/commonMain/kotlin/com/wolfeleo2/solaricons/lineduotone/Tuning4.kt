package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Tuning4: SolarIcon
    get() {
        if (_tuning4 != null) return _tuning4!!
        _tuning4 = SolarIcon(
            name = "Solar.LineDuotone.Tuning4",
            secondaryPaths = listOf(
                IconPath("M12 20H19M19 12H14M19 4H16"),
                IconPath("M12 4L5 4M10 12H5M5 20H7.66667"),
            ),
            primaryPaths = listOf(
                IconPath("M12 14C10.8954 14 10 13.1046 10 12C10 10.8954 10.8954 10 12 10C13.1046 10 14 10.8954 14 12C14 13.1046 13.1046 14 12 14Z"),
                IconPath("M14 6C12.8954 6 12 5.10457 12 4C12 2.89543 12.8954 2 14 2C15.1046 2 16 2.89543 16 4C16 5.10457 15.1046 6 14 6Z"),
                IconPath("M10 22C11.1046 22 12 21.1046 12 20C12 18.8954 11.1046 18 10 18C8.89543 18 8 18.8954 8 20C8 21.1046 8.89543 22 10 22Z"),
            ),
        )
        return _tuning4!!
    }

private var _tuning4: SolarIcon? = null
