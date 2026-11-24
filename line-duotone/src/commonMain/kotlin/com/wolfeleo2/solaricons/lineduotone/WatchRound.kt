package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.WatchRound: SolarIcon
    get() {
        if (_watchRound != null) return _watchRound!!
        _watchRound = SolarIcon(
            name = "Solar.LineDuotone.WatchRound",
            secondaryPaths = listOf(
                IconPath("M17 6.5L16.6961 5.13228C16.3624 3.63065 16.1955 2.87983 15.6471 2.43992C15.0987 2 14.3296 2 12.7913 2H11.2087C9.67043 2 8.9013 2 8.35289 2.43992C7.80448 2.87983 7.63763 3.63065 7.30394 5.13228L7 6.5"),
                IconPath("M17 17.5L16.6961 18.8677C16.3624 20.3694 16.1955 21.1202 15.6471 21.5601C15.0987 22 14.3296 22 12.7913 22H11.2087C9.67043 22 8.9013 22 8.35289 21.5601C7.80448 21.1202 7.63763 20.3694 7.30394 18.8677L7 17.5"),
                IconPath("M12 8.9231V12L14 13.9231"),
            ),
            primaryPaths = listOf(
                IconPath("M19.5 12C19.5 16.1421 16.1421 19.5 12 19.5C7.85786 19.5 4.5 16.1421 4.5 12C4.5 7.85786 7.85786 4.5 12 4.5C16.1421 4.5 19.5 7.85786 19.5 12Z"),
            ),
        )
        return _watchRound!!
    }

private var _watchRound: SolarIcon? = null
