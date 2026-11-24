package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Tuning: SolarIcon
    get() {
        if (_tuning != null) return _tuning!!
        _tuning = SolarIcon(
            name = "Solar.LineDuotone.Tuning",
            secondaryPaths = listOf(
                IconPath("M17 11L17.0415 2M7 2L7 6"),
                IconPath("M7 13L7 22M17 22V18"),
            ),
            primaryPaths = listOf(
                IconPath("M10 9.5C10 11.1569 8.65685 12.5 7 12.5C5.34315 12.5 4 11.1569 4 9.5C4 7.84315 5.34315 6.5 7 6.5C8.65685 6.5 10 7.84315 10 9.5Z"),
                IconPath("M20 14.5C20 12.8431 18.6569 11.5 17 11.5C15.3431 11.5 14 12.8431 14 14.5C14 16.1569 15.3431 17.5 17 17.5C18.6569 17.5 20 16.1569 20 14.5Z"),
            ),
        )
        return _tuning!!
    }

private var _tuning: SolarIcon? = null
