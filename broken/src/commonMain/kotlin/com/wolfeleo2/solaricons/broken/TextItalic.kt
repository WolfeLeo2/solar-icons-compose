package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.TextItalic: SolarIcon
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = SolarIcon(
            name = "Solar.Broken.TextItalic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 22H15M9 2H21M9 22L11.4 14M15 2L12.6 10"),
            ),
        )
        return _textItalic!!
    }

private var _textItalic: SolarIcon? = null
