package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TextItalic: SolarIcon
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = SolarIcon(
            name = "Solar.Linear.TextItalic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 22H15M9 2H21M9 22L15 2"),
            ),
        )
        return _textItalic!!
    }

private var _textItalic: SolarIcon? = null
