package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Import: SolarIcon
    get() {
        if (_import != null) return _import!!
        _import = SolarIcon(
            name = "Solar.Broken.Import",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 4L12 14M12 14L15 11M12 14L9 11"),
                IconPath("M12 20C7.58172 20 4 16.4183 4 12M20 12C20 14.5264 18.8289 16.7792 17 18.2454"),
            ),
        )
        return _import!!
    }

private var _import: SolarIcon? = null
