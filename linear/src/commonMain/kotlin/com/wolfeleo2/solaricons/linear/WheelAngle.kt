package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.WheelAngle: SolarIcon
    get() {
        if (_wheelAngle != null) return _wheelAngle!!
        _wheelAngle = SolarIcon(
            name = "Solar.Linear.WheelAngle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16.5 22C18.9853 22 21 17.5228 21 12C21 6.47715 18.9853 2 16.5 2"),
                IconPath("M12 12C12 17.5228 9.98528 22 7.5 22C5.01472 22 3 17.5228 3 12C3 6.47715 5.01472 2 7.5 2C9.98528 2 12 6.47715 12 12Z"),
                IconPath("M7.5 22C9.98528 22 12 17.5228 12 12C12 6.47715 9.98528 2 7.5 2"),
                IconPath("M9 12C9 15.3137 8.32843 18 7.5 18C6.67157 18 6 15.3137 6 12C6 8.68629 6.67157 6 7.5 6C8.32843 6 9 8.68629 9 12Z"),
                IconPath("M7.5 2L16.5 2"),
                IconPath("M7.5 22L16.5 22"),
                IconPath("M9 12H8"),
            ),
        )
        return _wheelAngle!!
    }

private var _wheelAngle: SolarIcon? = null
