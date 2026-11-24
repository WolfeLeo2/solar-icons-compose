package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.FaceScanCircle: SolarIcon
    get() {
        if (_faceScanCircle != null) return _faceScanCircle!!
        _faceScanCircle = SolarIcon(
            name = "Solar.Linear.FaceScanCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 16C9.85038 16.6303 10.8846 17 12 17C13.1154 17 14.1496 16.6303 15 16"),
                IconPath("M2.20001 10.0002C2.99539 6.08188 6.0818 2.99551 10.0001 2.2002"),
                IconPath("M2.2002 14C2.99557 17.9183 6.08198 21.0047 10.0003 21.8"),
                IconPath("M21.8001 10.0002C21.0047 6.08188 17.9183 2.99551 14 2.2002"),
                IconPath("M21.8001 14C21.0047 17.9183 17.9183 21.0047 14 21.8"),
            ),
        )
        return _faceScanCircle!!
    }

private var _faceScanCircle: SolarIcon? = null
