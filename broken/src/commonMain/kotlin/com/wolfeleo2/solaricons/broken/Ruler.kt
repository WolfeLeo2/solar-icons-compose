package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Ruler: SolarIcon
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = SolarIcon(
            name = "Solar.Broken.Ruler",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 12.2315L19.9546 11.2769C21.3182 9.91327 22 9.23148 22 8.38426C22 7.53704 21.3182 6.85525 19.9546 5.49167L18.5083 4.04537C17.1448 2.68179 16.463 2 15.6157 2C14.7685 2 14.0867 2.68179 12.7231 4.04537L4.04537 12.7231C2.68179 14.0867 2 14.7685 2 15.6157C2 16.463 2.68179 17.1448 4.04537 18.5083L5.49167 19.9546C6.85525 21.3182 7.53704 22 8.38426 22C9.23148 22 9.91327 21.3182 11.2769 19.9546L16.2315 15"),
                IconPath("M8.46436 8.46436L9.87857 9.87857"),
                IconPath("M12.707 4.22168L14.1212 5.63589"),
                IconPath("M4.22192 12.707L5.63614 14.1212"),
                IconPath("M6.34326 10.5859L8.46458 12.7073"),
                IconPath("M10.5857 6.34326L12.707 8.46458"),
            ),
        )
        return _ruler!!
    }

private var _ruler: SolarIcon? = null
