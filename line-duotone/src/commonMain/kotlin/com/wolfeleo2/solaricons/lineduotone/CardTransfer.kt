package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CardTransfer: SolarIcon
    get() {
        if (_cardTransfer != null) return _cardTransfer!!
        _cardTransfer = SolarIcon(
            name = "Solar.LineDuotone.CardTransfer",
            secondaryPaths = listOf(
                IconPath("M20 20V14M20 14L22 16M20 14L18 16"),
                IconPath("M10 16H6"),
                IconPath("M2 10L22 10"),
            ),
            primaryPaths = listOf(
                IconPath("M21.9991 11C21.99 7.8857 21.8915 6.23467 20.8284 5.17157C19.6569 4 17.7712 4 14 4H10C6.22876 4 4.34315 4 3.17157 5.17157C2 6.34315 2 8.22876 2 12C2 15.7712 2 17.6569 3.17157 18.8284C4.34315 20 6.22876 20 10 20H11.5"),
                IconPath("M15.5 14V20M15.5 20L17.5 18M15.5 20L13.5 18"),
            ),
        )
        return _cardTransfer!!
    }

private var _cardTransfer: SolarIcon? = null
