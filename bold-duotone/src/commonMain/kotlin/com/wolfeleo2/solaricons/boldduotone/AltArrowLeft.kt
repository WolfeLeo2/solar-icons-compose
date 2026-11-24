package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.AltArrowLeft: SolarIcon
    get() {
        if (_altArrowLeft != null) return _altArrowLeft!!
        _altArrowLeft = SolarIcon(
            name = "Solar.BoldDuotone.AltArrowLeft",
            secondaryPaths = listOf(
                IconPath("M15.9999 11.2929L15.9999 5.5703C15.9999 5.04189 15.2089 4.79869 14.7952 5.1999L12.3135 7.60648L15.9999 11.2929Z"),
            ),
            primaryPaths = listOf(
                IconPath("M11.5956 8.30273L8.16485 11.6296C7.94505 11.8428 7.94505 12.1573 8.16485 12.3704L14.7953 18.8001C15.2091 19.2013 16 18.9581 16 18.4297V12.7071L11.5956 8.30273Z"),
            ),
        )
        return _altArrowLeft!!
    }

private var _altArrowLeft: SolarIcon? = null
