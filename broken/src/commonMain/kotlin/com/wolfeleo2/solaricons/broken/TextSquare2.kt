package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TextSquare2: SolarIcon
    get() {
        if (_textSquare2 != null) return _textSquare2!!
        _textSquare2 = SolarIcon(
            name = "Solar.Broken.TextSquare2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 3C7.74882 3 5.62323 3 4.30256 4.31802C3.298 5.32056 3.05755 6.78787 3 9.3M21 9.3C20.9424 6.78787 20.702 5.32056 19.6974 4.31802C18.8789 3.50116 17.7513 3.19056 16 3.07246M21 14.7C20.9424 17.2121 20.702 18.6794 19.6974 19.682C18.3768 21 16.2512 21 12 21C7.74882 21 5.62323 21 4.30256 19.682C3.29801 18.6794 3.05756 17.2121 3 14.7"),
                IconPath("M8 8H16"),
                IconPath("M12 16L12 8"),
                IconPath("M22 12H20"),
                IconPath("M4 12H2"),
            ),
        )
        return _textSquare2!!
    }

private var _textSquare2: SolarIcon? = null
