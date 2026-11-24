package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.WineglassTriangle: SolarIcon
    get() {
        if (_wineglassTriangle != null) return _wineglassTriangle!!
        _wineglassTriangle = SolarIcon(
            name = "Solar.Broken.WineglassTriangle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 14.5714L20.5162 5.86382C21.5624 4.79409 20.7999 3 19.2991 3H14M12 14.5714L3.48381 5.86382C2.43759 4.79409 3.20008 3 4.70095 3H10M12 14.5714V21M12 21H16.2439M12 21H7.7561M7.47318 9.75H16.5268"),
            ),
        )
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: SolarIcon? = null
