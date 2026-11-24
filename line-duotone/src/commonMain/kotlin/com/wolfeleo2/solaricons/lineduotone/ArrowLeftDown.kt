package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ArrowLeftDown: SolarIcon
    get() {
        if (_arrowLeftDown != null) return _arrowLeftDown!!
        _arrowLeftDown = SolarIcon(
            name = "Solar.LineDuotone.ArrowLeftDown",
            secondaryPaths = listOf(
                IconPath("M18.5303 6.53033C18.8232 6.23744 18.8232 5.76256 18.5303 5.46967C18.2374 5.17678 17.7626 5.17678 17.4697 5.46967L18.5303 6.53033ZM17.4697 5.46967L5.46967 17.4697L6.53033 18.5303L18.5303 6.53033L17.4697 5.46967Z"),
            ),
            primaryPaths = listOf(
                IconPath("M6 9L6 18L15 18"),
            ),
        )
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: SolarIcon? = null
