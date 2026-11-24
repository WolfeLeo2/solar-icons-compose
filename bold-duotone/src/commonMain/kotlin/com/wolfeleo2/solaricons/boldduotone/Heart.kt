package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Heart: SolarIcon
    get() {
        if (_heart != null) return _heart!!
        _heart = SolarIcon(
            name = "Solar.BoldDuotone.Heart",
            secondaryPaths = listOf(
                IconPath("M8.10627 18.2471C5.29819 16.0836 2 13.5424 2 9.13734C2 4.27441 7.50016 0.825708 12 5.50088V20.5002C11 20.5002 10 19.7296 8.96173 18.9111C8.68471 18.6927 8.39814 18.4719 8.10627 18.2471Z", PathFillType.EvenOdd),
            ),
            primaryPaths = listOf(
                IconPath("M15.0383 18.9111C17.9806 16.5917 22 14.0003 22 9.13734C22 4.27441 16.4998 0.825708 12 5.50088V20.5002C13 20.5002 14 19.7296 15.0383 18.9111Z"),
            ),
        )
        return _heart!!
    }

private var _heart: SolarIcon? = null
