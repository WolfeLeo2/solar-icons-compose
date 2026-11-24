package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Scale: SolarIcon
    get() {
        if (_scale != null) return _scale!!
        _scale = SolarIcon(
            name = "Solar.Broken.Scale",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2.00024 11.9994C2.00024 16.7135 2.00024 19.0705 3.46471 20.535C4.92918 21.9994 7.2862 21.9994 12.0002 21.9994C16.7143 21.9994 19.0713 21.9994 20.5358 20.535C21.8928 19.1779 21.9924 17.0545 21.9997 12.9994M11.0002 2C6.94518 2.0073 4.82174 2.10686 3.46471 3.46389C2.64814 4.28046 2.28688 5.37454 2.12705 7"),
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375M21 3L12 12M12 12H16M12 12V8"),
            ),
        )
        return _scale!!
    }

private var _scale: SolarIcon? = null
