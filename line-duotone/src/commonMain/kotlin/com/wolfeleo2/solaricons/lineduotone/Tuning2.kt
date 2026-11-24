package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Tuning2: SolarIcon
    get() {
        if (_tuning2 != null) return _tuning2!!
        _tuning2 = SolarIcon(
            name = "Solar.LineDuotone.Tuning2",
            secondaryPaths = listOf(
                IconPath("M13 17L22 17"),
                IconPath("M11 7L2 6.9585"),
                IconPath("M2 17L6 17"),
                IconPath("M22 7L18 7"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 14C11.1569 14 12.5 15.3431 12.5 17C12.5 18.6568 11.1569 20 9.5 20C7.84315 20 6.5 18.6568 6.5 17C6.5 15.3431 7.84315 14 9.5 14Z"),
                IconPath("M14.5 3.99998C12.8431 3.99998 11.5 5.34312 11.5 6.99998C11.5 8.65683 12.8431 9.99998 14.5 9.99998C16.1569 9.99998 17.5 8.65683 17.5 6.99998C17.5 5.34312 16.1569 3.99998 14.5 3.99998Z"),
            ),
        )
        return _tuning2!!
    }

private var _tuning2: SolarIcon? = null
