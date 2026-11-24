package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MapArrowRight: SolarIcon
    get() {
        if (_mapArrowRight != null) return _mapArrowRight!!
        _mapArrowRight = SolarIcon(
            name = "Solar.LineDuotone.MapArrowRight",
            secondaryPaths = listOf(
                IconPath("M5.52689 12C5.52689 12.2499 5.4656 12.4998 5.34302 12.7294L2.19099 18.6331C1.45006 20.0209 3.00163 21.5021 4.49746 20.835L21.0072 13.4725C21.6691 13.1774 22 12.5887 22 12"),
            ),
            primaryPaths = listOf(
                IconPath("M5.52676 12C5.52676 11.7501 5.46548 11.5002 5.3429 11.2706L2.19087 5.36689C1.44994 3.97914 3.00151 2.49789 4.49734 3.16496L21.0071 10.5275C21.6689 10.8226 21.9999 11.4113 21.9999 12"),
            ),
        )
        return _mapArrowRight!!
    }

private var _mapArrowRight: SolarIcon? = null
