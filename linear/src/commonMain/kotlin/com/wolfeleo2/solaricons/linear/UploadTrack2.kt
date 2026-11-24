package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.UploadTrack2: SolarIcon
    get() {
        if (_uploadTrack2 != null) return _uploadTrack2!!
        _uploadTrack2 = SolarIcon(
            name = "Solar.Linear.UploadTrack2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 15V11V7"),
                IconPath("M11.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M16 10C14.3431 10 13 8.65685 13 7"),
                IconPath("M14 21.8C13.3538 21.9311 12.6849 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 12.6849 21.9311 13.3538 21.8 14"),
                IconPath("M18 22V15M18 15L20.5 17.5M18 15L15.5 17.5"),
            ),
        )
        return _uploadTrack2!!
    }

private var _uploadTrack2: SolarIcon? = null
