package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.BlackHole: SolarIcon
    get() {
        if (_blackHole != null) return _blackHole!!
        _blackHole = SolarIcon(
            name = "Solar.Linear.BlackHole",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M12 10C17 10 16.6 22 9 22"),
                IconPath("M12.3115 14C7.31152 14 7.71152 2 15.3115 2"),
                IconPath("M10.6314 10.6961C14.1669 7.16053 22.3694 15.9287 16.9954 21.3027"),
                IconPath("M13.6801 13.3039C10.1446 16.8395 1.94216 8.07135 7.31617 2.69734"),
                IconPath("M10.8516 13.5242C7.31605 9.98865 16.0842 1.78622 21.4582 7.16023"),
                IconPath("M13.4599 10.4758C16.9955 14.0113 8.22736 22.2138 2.85334 16.8398"),
                IconPath("M10 12.3115C10 7.31152 22 7.71152 22 15.3115"),
                IconPath("M14 12C14 17 2 16.6 2 9"),
            ),
        )
        return _blackHole!!
    }

private var _blackHole: SolarIcon? = null
