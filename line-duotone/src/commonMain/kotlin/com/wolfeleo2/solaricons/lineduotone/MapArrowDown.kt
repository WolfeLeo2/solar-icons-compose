package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MapArrowDown: SolarIcon
    get() {
        if (_mapArrowDown != null) return _mapArrowDown!!
        _mapArrowDown = SolarIcon(
            name = "Solar.LineDuotone.MapArrowDown",
            secondaryPaths = listOf(
                IconPath("M12 5.52689C12.2499 5.52689 12.4998 5.4656 12.7294 5.34302L18.6331 2.19099C20.0209 1.45006 21.5021 3.00163 20.835 4.49746L13.4725 21.0072C13.1774 21.6691 12.5887 22 12 22"),
            ),
            primaryPaths = listOf(
                IconPath("M12 5.52689C11.7501 5.52689 11.5002 5.4656 11.2706 5.34302L5.36689 2.19099C3.97914 1.45006 2.49789 3.00163 3.16496 4.49746L10.5275 21.0072C10.8226 21.6691 11.4113 22 12 22"),
            ),
        )
        return _mapArrowDown!!
    }

private var _mapArrowDown: SolarIcon? = null
