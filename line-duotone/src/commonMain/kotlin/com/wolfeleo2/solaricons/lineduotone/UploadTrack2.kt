package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UploadTrack2: SolarIcon
    get() {
        if (_uploadTrack2 != null) return _uploadTrack2!!
        _uploadTrack2 = SolarIcon(
            name = "Solar.LineDuotone.UploadTrack2",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M13 15V11V7"),
                IconPath("M11.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M16 10C14.3431 10 13 8.65685 13 7"),
                IconPath("M18 22V15M18 15L20.5 17.5M18 15L15.5 17.5"),
            ),
        )
        return _uploadTrack2!!
    }

private var _uploadTrack2: SolarIcon? = null
