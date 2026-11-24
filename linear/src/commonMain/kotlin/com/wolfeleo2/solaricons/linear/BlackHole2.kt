package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.BlackHole2: SolarIcon
    get() {
        if (_blackHole2 != null) return _blackHole2!!
        _blackHole2 = SolarIcon(
            name = "Solar.Linear.BlackHole2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M10.1418 10.3628C13.6876 6.81707 21.9137 15.6105 16.5242 21"),
                IconPath("M13.8582 13.6372C10.3124 17.1829 2.08634 8.38952 7.47584 3.00001"),
                IconPath("M10.3627 13.8579C6.81701 10.3122 15.6104 2.08609 20.9999 7.4756"),
                IconPath("M13.6373 10.1421C17.183 13.6878 8.38959 21.9139 3.00008 16.5244"),
            ),
        )
        return _blackHole2!!
    }

private var _blackHole2: SolarIcon? = null
