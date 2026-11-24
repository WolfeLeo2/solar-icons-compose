package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CardRecive: SolarIcon
    get() {
        if (_cardRecive != null) return _cardRecive!!
        _cardRecive = SolarIcon(
            name = "Solar.Broken.CardRecive",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 14V20M19 20L21 18M19 20L17 18"),
                IconPath("M22 12C22 8.22876 22 6.34315 20.8284 5.17157C19.6569 4 17.7712 4 14 4M14 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4"),
                IconPath("M10 16H6"),
                IconPath("M13 16H12.5"),
                IconPath("M2 10L7 10M22 10L11 10"),
            ),
        )
        return _cardRecive!!
    }

private var _cardRecive: SolarIcon? = null
