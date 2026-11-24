package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Magnifer: SolarIcon
    get() {
        if (_magnifer != null) return _magnifer!!
        _magnifer = SolarIcon(
            name = "Solar.BoldDuotone.Magnifer",
            secondaryPaths = listOf(
                IconPath("M20.3133 11.1566C20.3133 16.2137 16.2137 20.3133 11.1566 20.3133C6.09956 20.3133 2 16.2137 2 11.1566C2 6.09956 6.09956 2 11.1566 2C16.2137 2 20.3133 6.09956 20.3133 11.1566Z"),
            ),
            primaryPaths = listOf(
                IconPath("M17.1001 18.1224L20.7664 21.7887C21.0487 22.071 21.5064 22.071 21.7887 21.7887C22.071 21.5064 22.071 21.0487 21.7887 20.7664L18.1224 17.1001C17.809 17.4671 17.4671 17.809 17.1001 18.1224Z"),
            ),
        )
        return _magnifer!!
    }

private var _magnifer: SolarIcon? = null
