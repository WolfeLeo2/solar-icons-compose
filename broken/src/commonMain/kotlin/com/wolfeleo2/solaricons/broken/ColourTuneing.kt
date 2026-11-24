package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.ColourTuneing: SolarIcon
    get() {
        if (_colourTuneing != null) return _colourTuneing!!
        _colourTuneing = SolarIcon(
            name = "Solar.Broken.ColourTuneing",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12H9.5M22 12H14.5"),
                IconPath("M20.0002 15.6844C20.0002 19.0002 17.7345 22.0002 16.0002 22.0002C14.7427 22.0002 13.6725 21.03 12.9682 19M4.14404 8.31579C4.14404 5 6.40978 2 8.14404 2C10.4128 2 12.0723 5.15806 12.0723 12.0002C12.0723 13.0935 12.1146 14.0927 12.1951 15"),
            ),
        )
        return _colourTuneing!!
    }

private var _colourTuneing: SolarIcon? = null
