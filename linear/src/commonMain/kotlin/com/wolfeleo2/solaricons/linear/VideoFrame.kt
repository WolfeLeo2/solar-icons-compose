package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.VideoFrame: SolarIcon
    get() {
        if (_videoFrame != null) return _videoFrame!!
        _videoFrame = SolarIcon(
            name = "Solar.Linear.VideoFrame",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
                IconPath("M17 2.5L17 21.5"),
                IconPath("M7 2.5L7 21.5"),
                IconPath("M2.5 7L7 7M21.5 7L17 7"),
                IconPath("M2.5 17L7 17M21.5 17L17 17"),
                IconPath("M2 12H22"),
            ),
        )
        return _videoFrame!!
    }

private var _videoFrame: SolarIcon? = null
