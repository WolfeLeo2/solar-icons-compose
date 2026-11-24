package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DownloadTwiceSquare: SolarIcon
    get() {
        if (_downloadTwiceSquare != null) return _downloadTwiceSquare!!
        _downloadTwiceSquare = SolarIcon(
            name = "Solar.LineDuotone.DownloadTwiceSquare",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M8.5 7L8.5 14M8.5 14L11 11M8.5 14L6 11"),
                IconPath("M15.5 7L15.5 14M15.5 14L18 11M15.5 14L13 11"),
                IconPath("M18 17H12H6"),
            ),
        )
        return _downloadTwiceSquare!!
    }

private var _downloadTwiceSquare: SolarIcon? = null
