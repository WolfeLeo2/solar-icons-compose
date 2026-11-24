package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CropMinimalistic: SolarIcon
    get() {
        if (_cropMinimalistic != null) return _cropMinimalistic!!
        _cropMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.CropMinimalistic",
            secondaryPaths = listOf(
                IconPath("M2 5H5H11C14.7712 5 16.6569 5 17.8284 6.17157C19 7.34315 19 9.22876 19 13V19V22"),
            ),
            primaryPaths = listOf(
                IconPath("M22 19H13C9.22876 19 7.34315 19 6.17157 17.8284C5 16.6569 5 14.7712 5 11V2"),
            ),
        )
        return _cropMinimalistic!!
    }

private var _cropMinimalistic: SolarIcon? = null
