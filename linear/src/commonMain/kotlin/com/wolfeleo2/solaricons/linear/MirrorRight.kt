package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.MirrorRight: SolarIcon
    get() {
        if (_mirrorRight != null) return _mirrorRight!!
        _mirrorRight = SolarIcon(
            name = "Solar.Linear.MirrorRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 21H13C16.7712 21 18.6569 21 19.8284 19.8284C21 18.6569 21 16.7712 21 13V11C21 7.22876 21 5.34315 19.8284 4.17157C18.6569 3 16.7712 3 13 3L12 3"),
                IconPath("M13 21H9C6.17157 21 4.75736 21 3.87868 20.1213C3 19.2426 3 17.8284 3 15L3 9C3 6.17157 3 4.75736 3.87868 3.87868C4.75736 3 6.17157 3 9 3L13 3"),
                IconPath("M12 22L12 2"),
            ),
        )
        return _mirrorRight!!
    }

private var _mirrorRight: SolarIcon? = null
