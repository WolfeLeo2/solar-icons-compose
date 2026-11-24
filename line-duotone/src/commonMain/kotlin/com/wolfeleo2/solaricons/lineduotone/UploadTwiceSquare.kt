package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UploadTwiceSquare: SolarIcon
    get() {
        if (_uploadTwiceSquare != null) return _uploadTwiceSquare!!
        _uploadTwiceSquare = SolarIcon(
            name = "Solar.LineDuotone.UploadTwiceSquare",
            secondaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M8.5 17L8.5 10M8.5 10L11 13M8.5 10L6 13"),
                IconPath("M15.5 17L15.5 10M15.5 10L18 13M15.5 10L13 13"),
                IconPath("M18 7H12H6"),
            ),
        )
        return _uploadTwiceSquare!!
    }

private var _uploadTwiceSquare: SolarIcon? = null
