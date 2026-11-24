package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Help: SolarIcon
    get() {
        if (_help != null) return _help!!
        _help = SolarIcon(
            name = "Solar.Broken.Help",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 8.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M15 9L19 5"),
                IconPath("M5 19L9 15"),
                IconPath("M9 9L5 5"),
                IconPath("M19 19L15 15"),
                IconPath("M9.41235 2.33886C11.0533 1.89769 12.8289 1.8693 14.5882 2.34072C19.9229 3.77014 23.0887 9.25351 21.6593 14.5882C20.2299 19.9228 14.7465 23.0887 9.41185 21.6592C4.07719 20.2298 0.911364 14.7465 2.34078 9.41179C2.8122 7.65242 3.72457 6.12895 4.92711 4.92841"),
            ),
        )
        return _help!!
    }

private var _help: SolarIcon? = null
