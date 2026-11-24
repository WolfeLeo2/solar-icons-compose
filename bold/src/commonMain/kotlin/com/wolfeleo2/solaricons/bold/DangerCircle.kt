package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.DangerCircle: SolarIcon
    get() {
        if (_dangerCircle != null) return _dangerCircle!!
        _dangerCircle = SolarIcon(
            name = "Solar.Bold.DangerCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12ZM12 6.25C12.4142 6.25 12.75 6.58579 12.75 7V13C12.75 13.4142 12.4142 13.75 12 13.75C11.5858 13.75 11.25 13.4142 11.25 13V7C11.25 6.58579 11.5858 6.25 12 6.25ZM12 17C12.5523 17 13 16.5523 13 16C13 15.4477 12.5523 15 12 15C11.4477 15 11 15.4477 11 16C11 16.5523 11.4477 17 12 17Z", PathFillType.EvenOdd),
            ),
        )
        return _dangerCircle!!
    }

private var _dangerCircle: SolarIcon? = null
