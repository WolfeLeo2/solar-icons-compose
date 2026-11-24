package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TextItalic: SolarIcon
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = SolarIcon(
            name = "Solar.LineDuotone.TextItalic",
            secondaryPaths = listOf(
                IconPath("M9 22L15 2"),
            ),
            primaryPaths = listOf(
                IconPath("M3 22H15M9 2H21"),
            ),
        )
        return _textItalic!!
    }

private var _textItalic: SolarIcon? = null
