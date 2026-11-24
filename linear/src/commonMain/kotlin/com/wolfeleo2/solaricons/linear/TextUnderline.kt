package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TextUnderline: SolarIcon
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = SolarIcon(
            name = "Solar.Linear.TextUnderline",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 21H20"),
                IconPath("M4 3V9C4 13.4183 7.58172 17 12 17C16.4183 17 20 13.4183 20 9V3"),
            ),
        )
        return _textUnderline!!
    }

private var _textUnderline: SolarIcon? = null
