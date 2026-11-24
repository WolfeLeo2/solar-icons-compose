package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.BlackHole3: SolarIcon
    get() {
        if (_blackHole3 != null) return _blackHole3!!
        _blackHole3 = SolarIcon(
            name = "Solar.Broken.BlackHole3",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M12 10C17 10 16.6 22 9 22"),
                IconPath("M12.3115 14C7.31152 14 7.71152 2 15.3115 2"),
                IconPath("M10 12.3115C10 9.53259 13.7068 8.42171 17 9.28791M22 15.3115C22 13.342 21.1941 11.856 20 10.8222"),
                IconPath("M14 12C14 14.7789 10.2932 15.8898 7 15.0236M2 9C2 10.6801 2.58643 12.0083 3.5 13.0041"),
            ),
        )
        return _blackHole3!!
    }

private var _blackHole3: SolarIcon? = null
