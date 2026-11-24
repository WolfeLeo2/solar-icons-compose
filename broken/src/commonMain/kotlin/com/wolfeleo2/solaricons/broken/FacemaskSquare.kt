package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.FacemaskSquare: SolarIcon
    get() {
        if (_facemaskSquare != null) return _facemaskSquare!!
        _facemaskSquare = SolarIcon(
            name = "Solar.Broken.FacemaskSquare",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.43821 2.49073 5.80655 2.16444 8 2.0551"),
                IconPath("M16.5 21.5001L17 15.0001L13.857 13.7429C12.6649 13.266 11.3351 13.266 10.143 13.7429L7 15.0001L7.5 21.5001"),
                IconPath("M7 15L2.5 13"),
                IconPath("M7 19L3.5 20.5"),
                IconPath("M17 15L21.5 13"),
                IconPath("M17 19L20.5 20.5"),
            ),
        )
        return _facemaskSquare!!
    }

private var _facemaskSquare: SolarIcon? = null
