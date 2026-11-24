package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TextItalicCircle: SolarIcon
    get() {
        if (_textItalicCircle != null) return _textItalicCircle!!
        _textItalicCircle = SolarIcon(
            name = "Solar.LineDuotone.TextItalicCircle",
            secondaryPaths = listOf(
                IconPath("M2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M8 17H13.3333M10.6667 7H16M10.6667 17L13.3333 7"),
            ),
        )
        return _textItalicCircle!!
    }

private var _textItalicCircle: SolarIcon? = null
