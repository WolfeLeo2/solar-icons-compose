package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CourseUp: SolarIcon
    get() {
        if (_courseUp != null) return _courseUp!!
        _courseUp = SolarIcon(
            name = "Solar.LineDuotone.CourseUp",
            secondaryPaths = listOf(
                IconPath("M22 7L14.6203 14.3347C13.6227 15.3263 13.1238 15.822 12.5051 15.822C11.8864 15.8219 11.3876 15.326 10.3902 14.3342L10.1509 14.0962C9.15254 13.1035 8.65338 12.6071 8.03422 12.6074C7.41506 12.6076 6.91626 13.1043 5.91867 14.0977L2 18"),
            ),
            primaryPaths = listOf(
                IconPath("M22.0001 12.5458V7H16.418"),
            ),
        )
        return _courseUp!!
    }

private var _courseUp: SolarIcon? = null
