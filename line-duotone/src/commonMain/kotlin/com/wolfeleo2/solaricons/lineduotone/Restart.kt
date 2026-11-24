package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Restart: SolarIcon
    get() {
        if (_restart != null) return _restart!!
        _restart = SolarIcon(
            name = "Solar.LineDuotone.Restart",
            secondaryPaths = listOf(
                IconPath("M19.7285 10.9286C20.4412 13.5975 19.7507 16.5633 17.6569 18.6571C14.5327 21.7813 9.46734 21.7813 6.34315 18.6571C3.21895 15.5329 3.21895 10.4676 6.34315 7.34338C9.46734 4.21918 14.5327 4.21918 17.6569 7.34338L18.364 8.05048"),
            ),
            primaryPaths = listOf(
                IconPath("M14.1214 8.05026H18.364V3.80762"),
            ),
        )
        return _restart!!
    }

private var _restart: SolarIcon? = null
