package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ExpressionlessCircle: SolarIcon
    get() {
        if (_expressionlessCircle != null) return _expressionlessCircle!!
        _expressionlessCircle = SolarIcon(
            name = "Solar.LineDuotone.ExpressionlessCircle",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 16C10 16 10.8846 16 12 16C13.1154 16 14 16 15 16"),
                IconPath("M16 10.5C16 11.3284 15.5523 12 15 12C14.4477 12 14 11.3284 14 10.5C14 9.67157 14.4477 9 15 9C15.5523 9 16 9.67157 16 10.5Z"),
            ),
        )
        return _expressionlessCircle!!
    }

private var _expressionlessCircle: SolarIcon? = null
