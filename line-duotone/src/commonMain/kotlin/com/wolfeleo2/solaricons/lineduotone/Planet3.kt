package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Planet3: SolarIcon
    get() {
        if (_planet3 != null) return _planet3!!
        _planet3 = SolarIcon(
            name = "Solar.LineDuotone.Planet3",
            secondaryPaths = listOf(
                IconPath("M3 8.0077C3 8.0077 5.93717 11 10.4372 11C13.5 11 15.1257 9.22689 16.5 8.75574C19.0829 7.87029 21 8.0077 21 8.0077"),
                IconPath("M2.99986 14.0077C2.99986 14.0077 5.08875 13.8703 7.90309 14.7558C9.40057 15.2269 11.1719 17 14.5092 17C17.521 17 19.8903 15.871 21.27 15"),
            ),
            primaryPaths = listOf(
                IconPath("M22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12Z"),
            ),
        )
        return _planet3!!
    }

private var _planet3: SolarIcon? = null
