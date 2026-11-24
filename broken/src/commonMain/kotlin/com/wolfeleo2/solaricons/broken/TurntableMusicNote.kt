package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TurntableMusicNote: SolarIcon
    get() {
        if (_turntableMusicNote != null) return _turntableMusicNote!!
        _turntableMusicNote = SolarIcon(
            name = "Solar.Broken.TurntableMusicNote",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12M21.9948 10C21.9658 6.58687 21.7764 4.70529 20.5355 3.46447C19.0711 2 16.714 2 12 2C7.28595 2 4.92893 2 3.46447 3.46447C2.49073 4.43821 2.16444 5.80655 2.0551 8"),
                IconPath("M19 20V16V12"),
                IconPath("M17.0 18.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M22 15C20.3431 15 19 13.6569 19 12"),
                IconPath("M9 12C9 10.3431 10.3431 9 12 9C13.6569 9 15 10.3431 15 12C15 13.6569 13.6569 15 12 15C10.3431 15 9 13.6569 9 12Z"),
            ),
        )
        return _turntableMusicNote!!
    }

private var _turntableMusicNote: SolarIcon? = null
