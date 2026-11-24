package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowRightDown: SolarIcon
    get() {
        if (_arrowRightDown != null) return _arrowRightDown!!
        _arrowRightDown = SolarIcon(
            name = "Solar.LineDuotone.ArrowRightDown",
            secondaryPaths = listOf(
                IconPath("M6.53033 5.46967C6.23744 5.17678 5.76256 5.17678 5.46967 5.46967C5.17678 5.76256 5.17678 6.23744 5.46967 6.53033L6.53033 5.46967ZM5.46967 6.53033L17.4697 18.5303L18.5303 17.4697L6.53033 5.46967L5.46967 6.53033Z"),
            ),
            primaryPaths = listOf(
                IconPath("M18 9L18 18L9 18"),
            ),
        )
        return _arrowRightDown!!
    }

private var _arrowRightDown: SolarIcon? = null
