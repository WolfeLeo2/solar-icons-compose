package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.PlaylistMinimalistic2: SolarIcon
    get() {
        if (_playlistMinimalistic2 != null) return _playlistMinimalistic2!!
        _playlistMinimalistic2 = SolarIcon(
            name = "Solar.Broken.PlaylistMinimalistic2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 14H3"),
                IconPath("M8 18H3"),
                IconPath("M17 16.5V12.5V8"),
                IconPath("M14.5 14.0 a2.5 2.5 0 1 0 0 5.0 a2.5 2.5 0 1 0 0 -5.0z"),
                IconPath("M21 12C18.7909 12 17 10.2091 17 8"),
                IconPath("M3 6H10.4118M15 6H13.4118"),
                IconPath("M13 10L6.82353 10M3 10H4.32353"),
            ),
        )
        return _playlistMinimalistic2!!
    }

private var _playlistMinimalistic2: SolarIcon? = null
