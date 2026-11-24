package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowDown: SolarIcon
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = SolarIcon(
            name = "Solar.LineDuotone.ArrowDown",
            secondaryPaths = listOf(
                IconPath("M12.75 4C12.75 3.58579 12.4142 3.25 12 3.25C11.5858 3.25 11.25 3.58579 11.25 4L12.75 4ZM11.25 4L11.25 20L12.75 20L12.75 4L11.25 4Z"),
            ),
            primaryPaths = listOf(
                IconPath("M18 14L12 20L6 14"),
            ),
        )
        return _arrowDown!!
    }

private var _arrowDown: SolarIcon? = null
