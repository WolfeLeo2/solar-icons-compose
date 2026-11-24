package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Export: SolarIcon
    get() {
        if (_export != null) return _export!!
        _export = SolarIcon(
            name = "Solar.Broken.Export",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 20C7.58172 20 4 16.4183 4 12M20 12C20 14.5264 18.8289 16.7792 17 18.2454"),
                IconPath("M12 14L12 4M12 4L15 7M12 4L9 7"),
            ),
        )
        return _export!!
    }

private var _export: SolarIcon? = null
