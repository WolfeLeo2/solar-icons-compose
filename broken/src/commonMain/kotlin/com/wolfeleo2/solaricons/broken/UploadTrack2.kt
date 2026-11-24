package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.UploadTrack2: SolarIcon
    get() {
        if (_uploadTrack2 != null) return _uploadTrack2!!
        _uploadTrack2 = SolarIcon(
            name = "Solar.Broken.UploadTrack2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M13 15V11V7"),
                IconPath("M11.0 13.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M16 10C14.3431 10 13 8.65685 13 7"),
                IconPath("M18 22V15M18 15L20.5 17.5M18 15L15.5 17.5"),
                IconPath("M14 21.8C13.3538 21.9311 12.6849 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7M21.8 14C21.9311 13.3538 22 12.6849 22 12C22 6.47715 17.5228 2 12 2C10.1786 2 8.47087 2.48697 7 3.33782"),
            ),
        )
        return _uploadTrack2!!
    }

private var _uploadTrack2: SolarIcon? = null
