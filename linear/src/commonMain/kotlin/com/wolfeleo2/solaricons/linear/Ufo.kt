package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Ufo: SolarIcon
    get() {
        if (_ufo != null) return _ufo!!
        _ufo = SolarIcon(
            name = "Solar.Linear.Ufo",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 8.21094C19.989 8.93258 22 10.2814 22 11.8262C22 14.1313 17.5228 15.9999 12 15.9999C6.47715 15.9999 2 14.1313 2 11.8262C2 10.2814 4.01099 8.93258 7 8.21094"),
                IconPath("M7 8.72876C7 6.11714 9.11714 4 11.7288 4H12.2712C14.8829 4 17 6.11714 17 8.72876C17 8.90601 16.9458 9.07918 16.8003 9.18039C16.3862 9.4684 15.1898 10 12 10C8.81016 10 7.6138 9.4684 7.19972 9.18039C7.0542 9.07918 7 8.90601 7 8.72876Z"),
                IconPath("M12 16V19"),
                IconPath("M5.50036 15.5L4.5 17.5"),
                IconPath("M18.4996 15.5L19.5 17.5"),
                IconPath("M12.0 12.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
                IconPath("M7.0 11.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
                IconPath("M17.0 11.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
            ),
        )
        return _ufo!!
    }

private var _ufo: SolarIcon? = null
