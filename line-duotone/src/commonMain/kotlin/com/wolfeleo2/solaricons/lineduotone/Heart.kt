package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Heart: SolarIcon
    get() {
        if (_heart != null) return _heart!!
        _heart = SolarIcon(
            name = "Solar.LineDuotone.Heart",
            secondaryPaths = listOf(
                IconPath("M12 5.50088C16.4998 0.825708 22 4.27441 22 9.13734C22 14.0003 17.9806 16.5917 15.0383 18.9111C14 19.7296 13 20.5002 12 20.5002"),
            ),
            primaryPaths = listOf(
                IconPath("M12 5.50088C7.50016 0.825708 2 4.27441 2 9.13734C2 14.0003 6.01943 16.5917 8.96173 18.9111C10 19.7296 11 20.5002 12 20.5002"),
            ),
        )
        return _heart!!
    }

private var _heart: SolarIcon? = null
