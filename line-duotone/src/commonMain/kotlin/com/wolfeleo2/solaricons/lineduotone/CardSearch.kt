package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CardSearch: SolarIcon
    get() {
        if (_cardSearch != null) return _cardSearch!!
        _cardSearch = SolarIcon(
            name = "Solar.LineDuotone.CardSearch",
            secondaryPaths = listOf(
                IconPath("M10 16H6"),
                IconPath("M2 10L22 10"),
            ),
            primaryPaths = listOf(
                IconPath("M22 13V12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4H10C6.22876 4 4.34315 4 3.17157 5.17157C2 6.34315 2 8.22876 2 12C2 15.7712 2 17.6569 3.17157 18.8284C4.34315 20 6.22876 20 10 20H13"),
                IconPath("M18.0 14.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
                IconPath("M20.5 19.5L21.5 20.5"),
            ),
        )
        return _cardSearch!!
    }

private var _cardSearch: SolarIcon? = null
