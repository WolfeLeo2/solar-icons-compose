package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TextUnderline: SolarIcon
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = SolarIcon(
            name = "Solar.Broken.TextUnderline",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 21H20"),
                IconPath("M4 3V9C4 11.5264 5.17108 13.7792 7 15.2454M20 3V9C20 13.4183 16.4183 17 12 17"),
            ),
        )
        return _textUnderline!!
    }

private var _textUnderline: SolarIcon? = null
