package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.AltArrowRight: SolarIcon
    get() {
        if (_altArrowRight != null) return _altArrowRight!!
        _altArrowRight = SolarIcon(
            name = "Solar.BoldDuotone.AltArrowRight",
            secondaryPaths = listOf(
                IconPath("M8 11.2929L8 5.5703C8 5.04189 8.79094 4.79869 9.20467 5.1999L11.6864 7.60648L8 11.2929Z"),
            ),
            primaryPaths = listOf(
                IconPath("M12.4044 8.30273L15.8351 11.6296C16.0549 11.8428 16.0549 12.1573 15.8351 12.3704L9.20467 18.8001C8.79094 19.2013 8 18.9581 8 18.4297V12.7071L12.4044 8.30273Z"),
            ),
        )
        return _altArrowRight!!
    }

private var _altArrowRight: SolarIcon? = null
