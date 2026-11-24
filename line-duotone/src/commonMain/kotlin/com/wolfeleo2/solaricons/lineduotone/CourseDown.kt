package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CourseDown: SolarIcon
    get() {
        if (_courseDown != null) return _courseDown!!
        _courseDown = SolarIcon(
            name = "Solar.LineDuotone.CourseDown",
            secondaryPaths = listOf(
                IconPath("M22 18L14.6203 10.6653C13.6227 9.67375 13.1238 9.17795 12.5051 9.17802C11.8864 9.17809 11.3876 9.674 10.3902 10.6658L10.1509 10.9038C9.15254 11.8965 8.65338 12.3929 8.03422 12.3926C7.41506 12.3924 6.91626 11.8957 5.91867 10.9023L2 7"),
            ),
            primaryPaths = listOf(
                IconPath("M22.0001 12.4541V17.9999H16.418"),
            ),
        )
        return _courseDown!!
    }

private var _courseDown: SolarIcon? = null
