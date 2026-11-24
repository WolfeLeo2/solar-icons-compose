package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.AltArrowUp: SolarIcon
    get() {
        if (_altArrowUp != null) return _altArrowUp!!
        _altArrowUp = SolarIcon(
            name = "Solar.BoldDuotone.AltArrowUp",
            secondaryPaths = listOf(
                IconPath("M11.2929 15.9999H5.5703C5.04189 15.9999 4.79869 15.2089 5.1999 14.7952L7.60648 12.3135L11.2929 15.9999Z"),
            ),
            primaryPaths = listOf(
                IconPath("M8.30273 11.5956L11.6296 8.16485C11.8428 7.94505 12.1573 7.94505 12.3704 8.16485L18.8001 14.7953C19.2013 15.2091 18.9581 16 18.4297 16H12.7071L8.30273 11.5956Z"),
            ),
        )
        return _altArrowUp!!
    }

private var _altArrowUp: SolarIcon? = null
