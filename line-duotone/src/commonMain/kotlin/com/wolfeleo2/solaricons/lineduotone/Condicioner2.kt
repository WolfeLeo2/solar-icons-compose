package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Condicioner2: SolarIcon
    get() {
        if (_condicioner2 != null) return _condicioner2!!
        _condicioner2 = SolarIcon(
            name = "Solar.LineDuotone.Condicioner2",
            secondaryPaths = listOf(
                IconPath("M18 18.5C18 17.0955 18 16.3933 17.6629 15.8889C17.517 15.6705 17.3295 15.483 17.1111 15.3371C16.6067 15 15.9045 15 14.5 15H9.5C8.09554 15 7.39331 15 6.88886 15.3371C6.67048 15.483 6.48298 15.6705 6.33706 15.8889C6 16.3933 6 17.0955 6 18.5"),
            ),
            primaryPaths = listOf(
                IconPath("M2 11C2 8.17157 2 6.75736 2.87868 5.87868C3.75736 5 5.17157 5 8 5H16C18.8284 5 20.2426 5 21.1213 5.87868C22 6.75736 22 8.17157 22 11C22 14.7712 22 16.6569 20.8284 17.8284C19.6569 19 17.7712 19 14 19H10C6.22876 19 4.34315 19 3.17157 17.8284C2 16.6569 2 14.7712 2 11Z"),
                IconPath("M6 11.5H18"),
                IconPath("M6 9H18"),
            ),
        )
        return _condicioner2!!
    }

private var _condicioner2: SolarIcon? = null
