package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.MirrorLeft: SolarIcon
    get() {
        if (_mirrorLeft != null) return _mirrorLeft!!
        _mirrorLeft = SolarIcon(
            name = "Solar.Broken.MirrorLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 12C3 16.2426 3 18.364 4.31802 19.682C5.63604 21 7.75736 21 12 21M12 3C7.75736 3 5.63604 3 4.31802 4.31802C3.50241 5.13363 3.19151 6.25685 3.073 8"),
                IconPath("M11 21H15C17.8284 21 19.2426 21 20.1213 20.1213C21 19.2426 21 17.8284 21 15V9C21 6.17157 21 4.75736 20.1213 3.87868C19.2426 3 17.8284 3 15 3H11"),
                IconPath("M12 22L12 2"),
            ),
        )
        return _mirrorLeft!!
    }

private var _mirrorLeft: SolarIcon? = null
