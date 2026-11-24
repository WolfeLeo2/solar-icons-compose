package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TextCross: SolarIcon
    get() {
        if (_textCross != null) return _textCross!!
        _textCross = SolarIcon(
            name = "Solar.Broken.TextCross",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 3H8C6.11438 3 5.17157 3 4.58579 3.58579C4 4.17157 4 5.11438 4 7V7.95M12 3H16C17.8856 3 18.8284 3 19.4142 3.58579C20 4.17157 20 5.11438 20 7V7.95M12 3V9M12 21V19.5M12 15V17"),
                IconPath("M7 21H17"),
                IconPath("M4 12H20"),
            ),
        )
        return _textCross!!
    }

private var _textCross: SolarIcon? = null
