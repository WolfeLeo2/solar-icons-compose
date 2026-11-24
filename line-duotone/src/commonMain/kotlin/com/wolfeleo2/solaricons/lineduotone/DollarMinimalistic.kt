package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.DollarMinimalistic: SolarIcon
    get() {
        if (_dollarMinimalistic != null) return _dollarMinimalistic!!
        _dollarMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.DollarMinimalistic",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 17V17.5V18"),
                IconPath("M12 6V6.5V7"),
                IconPath("M15 9.5C15 8.11929 13.6569 7 12 7C10.3431 7 9 8.11929 9 9.5C9 10.8807 10.3431 12 12 12C13.6569 12 15 13.1193 15 14.5C15 15.8807 13.6569 17 12 17C10.3431 17 9 15.8807 9 14.5"),
            ),
        )
        return _dollarMinimalistic!!
    }

private var _dollarMinimalistic: SolarIcon? = null
