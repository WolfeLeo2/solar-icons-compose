package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Translation: SolarIcon
    get() {
        if (_translation != null) return _translation!!
        _translation = SolarIcon(
            name = "Solar.Broken.Translation",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12C22 14.7578 20.8836 17.2549 19.0782 19.064M19.1414 5.00003C19.987 5.86255 20.6775 6.87759 21.1679 8.00006M5 19.1415C3.14864 17.3265 2 14.7974 2 12C2 9.235 3.12222 6.73208 4.93603 4.92188"),
                IconPath("M6 11.9822C6 10.4266 6.67333 9.01843 7.76162 8M16.2849 8.04397C17.3458 9.05877 18 10.4488 18 11.9822C18 13.5338 17.3302 14.9386 16.2469 15.9564M7.8 16C7.47294 15.6994 7.18244 15.3639 6.93531 15"),
                IconPath("M12.0 10.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
            ),
        )
        return _translation!!
    }

private var _translation: SolarIcon? = null
