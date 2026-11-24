package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.PlaylistMinimalistic2: SolarIcon
    get() {
        if (_playlistMinimalistic2 != null) return _playlistMinimalistic2!!
        _playlistMinimalistic2 = SolarIcon(
            name = "Solar.LineDuotone.PlaylistMinimalistic2",
            secondaryPaths = listOf(
                IconPath("M15 6L3 6"),
                IconPath("M13 10L3 10"),
                IconPath("M9 14H3"),
                IconPath("M8 18H3"),
            ),
            primaryPaths = listOf(
                IconPath("M17 16.5V12.5V8"),
                IconPath("M14.5 14.0 a2.5 2.5 0 1 0 0 5.0 a2.5 2.5 0 1 0 0 -5.0z"),
                IconPath("M21 12C18.7909 12 17 10.2091 17 8"),
            ),
        )
        return _playlistMinimalistic2!!
    }

private var _playlistMinimalistic2: SolarIcon? = null
