package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ColourTuneing: SolarIcon
    get() {
        if (_colourTuneing != null) return _colourTuneing!!
        _colourTuneing = SolarIcon(
            name = "Solar.LineDuotone.ColourTuneing",
            secondaryPaths = listOf(
                IconPath("M2 12H9.5M22 12H14.5"),
            ),
            primaryPaths = listOf(
                IconPath("M20.0002 15.6844C20.0002 19.0002 17.7345 22.0002 16.0002 22.0002C13.7315 22.0002 12.0723 18.8423 12.0723 12.0002C12.0723 5.15806 10.4128 2 8.14404 2C6.40978 2 4.14404 5 4.14404 8.31579"),
            ),
        )
        return _colourTuneing!!
    }

private var _colourTuneing: SolarIcon? = null
