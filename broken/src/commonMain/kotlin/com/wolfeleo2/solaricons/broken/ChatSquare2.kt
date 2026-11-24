package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ChatSquare2: SolarIcon
    get() {
        if (_chatSquare2 != null) return _chatSquare2!!
        _chatSquare2 = SolarIcon(
            name = "Solar.Broken.ChatSquare2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 18L7 15"),
                IconPath("M12 18V12"),
                IconPath("M17 18V9"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _chatSquare2!!
    }

private var _chatSquare2: SolarIcon? = null
