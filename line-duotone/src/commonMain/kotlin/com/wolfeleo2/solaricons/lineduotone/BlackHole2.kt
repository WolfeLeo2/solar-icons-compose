package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BlackHole2: SolarIcon
    get() {
        if (_blackHole2 != null) return _blackHole2!!
        _blackHole2 = SolarIcon(
            name = "Solar.LineDuotone.BlackHole2",
            secondaryPaths = listOf(
                IconPath("M10.1418 10.3628C13.6876 6.81707 21.9137 15.6105 16.5242 21"),
                IconPath("M13.8582 13.6372C10.3124 17.1829 2.08634 8.38952 7.47584 3.00001"),
                IconPath("M10.3628 13.8579C6.81707 10.3122 15.6105 2.08609 21 7.4756"),
                IconPath("M13.6372 10.1421C17.1829 13.6878 8.38952 21.9139 3.00002 16.5244"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _blackHole2!!
    }

private var _blackHole2: SolarIcon? = null
