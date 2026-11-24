package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Streets: SolarIcon
    get() {
        if (_streets != null) return _streets!!
        _streets = SolarIcon(
            name = "Solar.BoldDuotone.Streets",
            secondaryPaths = listOf(
                IconPath("M3.46447 3.46447C2 4.92893 2 7.28596 2 12C2 16.134 2 18.4553 2.98767 19.9517L19.9517 2.98766C18.4553 2 16.134 2 12 2C7.28595 2 4.92893 2 3.46447 3.46447Z"),
            ),
            primaryPaths = listOf(
                IconPath("M21.0124 4.04785L13.0607 11.9995L21.0124 19.9512C22 18.4549 22 16.1335 22 11.9995C22 7.86553 22 5.54419 21.0124 4.04785Z"),
                IconPath("M12 13.0602L4.04834 21.0119C5.54468 21.9995 7.86601 21.9995 12 21.9995C16.134 21.9995 18.4554 21.9995 19.9517 21.0119L12 13.0602Z"),
            ),
        )
        return _streets!!
    }

private var _streets: SolarIcon? = null
