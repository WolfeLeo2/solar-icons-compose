package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Buildings3: SolarIcon
    get() {
        if (_buildings3 != null) return _buildings3!!
        _buildings3 = SolarIcon(
            name = "Solar.Linear.Buildings3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 22L2 22"),
                IconPath("M17 22V6C17 4.11438 17 3.17157 16.4142 2.58579C15.8284 2 14.8856 2 13 2H11C9.11438 2 8.17157 2 7.58579 2.58579C7 3.17157 7 4.11438 7 6V22"),
                IconPath("M21 22V8.5C21 7.09554 21 6.39331 20.6629 5.88886C20.517 5.67048 20.3295 5.48298 20.1111 5.33706C19.6067 5 18.9045 5 17.5 5"),
                IconPath("M3 22V8.5C3 7.09554 3 6.39331 3.33706 5.88886C3.48298 5.67048 3.67048 5.48298 3.88886 5.33706C4.39331 5 5.09554 5 6.5 5"),
                IconPath("M12 22V19"),
                IconPath("M10 12H14"),
                IconPath("M5.5 11H7"),
                IconPath("M5.5 14H7"),
                IconPath("M17 11H18.5"),
                IconPath("M17 14H18.5"),
                IconPath("M5.5 8H7"),
                IconPath("M17 8H18.5"),
                IconPath("M10 15H14"),
                IconPath("M12.0 5.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _buildings3!!
    }

private var _buildings3: SolarIcon? = null
