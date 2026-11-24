package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CardRecive: SolarIcon
    get() {
        if (_cardRecive != null) return _cardRecive!!
        _cardRecive = SolarIcon(
            name = "Solar.LineDuotone.CardRecive",
            secondaryPaths = listOf(
                IconPath("M10 16H6"),
                IconPath("M13 16H12.5"),
                IconPath("M2 10L22 10"),
            ),
            primaryPaths = listOf(
                IconPath("M19 14V20M19 20L21 18M19 20L17 18"),
                IconPath("M22 12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4H10C6.22876 4 4.34315 4 3.17157 5.17157C2 6.34315 2 8.22876 2 12C2 15.7712 2 17.6569 3.17157 18.8284C4.34315 20 6.22876 20 10 20H14"),
            ),
        )
        return _cardRecive!!
    }

private var _cardRecive: SolarIcon? = null
