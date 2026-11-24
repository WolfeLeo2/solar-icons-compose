package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TextUnderline: SolarIcon
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = SolarIcon(
            name = "Solar.LineDuotone.TextUnderline",
            secondaryPaths = listOf(
                IconPath("M4 3V9C4 13.4183 7.58172 17 12 17C16.4183 17 20 13.4183 20 9V3"),
            ),
            primaryPaths = listOf(
                IconPath("M4 21H20"),
            ),
        )
        return _textUnderline!!
    }

private var _textUnderline: SolarIcon? = null
