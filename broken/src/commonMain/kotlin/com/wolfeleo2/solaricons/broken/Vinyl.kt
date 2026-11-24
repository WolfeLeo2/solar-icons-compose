package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Vinyl: SolarIcon
    get() {
        if (_vinyl != null) return _vinyl!!
        _vinyl = SolarIcon(
            name = "Solar.Broken.Vinyl",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 9.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M21.9506 13.0004C21.4489 18.0538 17.1853 22.0004 12 22.0004C6.47715 22.0004 2 17.5233 2 12.0004C2 10.179 2.48697 8.4713 3.33782 7.00043M11 2.0498C9.55385 2.19339 8.19833 2.64506 7 3.33825"),
                IconPath("M15 11.9992V2.45703C18.1101 3.43385 20.5654 5.88916 21.5422 8.99923"),
            ),
        )
        return _vinyl!!
    }

private var _vinyl: SolarIcon? = null
