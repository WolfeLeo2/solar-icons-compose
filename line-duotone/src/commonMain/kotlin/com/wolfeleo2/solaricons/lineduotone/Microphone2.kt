package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Microphone2: SolarIcon
    get() {
        if (_microphone2 != null) return _microphone2!!
        _microphone2 = SolarIcon(
            name = "Solar.LineDuotone.Microphone2",
            secondaryPaths = listOf(
                IconPath("M13.5 8L17 8"),
                IconPath("M13.5 11L17 11"),
                IconPath("M7 8L9 8"),
                IconPath("M7 11L9 11"),
                IconPath("M20 10V11C20 15.4183 16.4183 19 12 19M4 10V11C4 15.4183 7.58172 19 12 19M12 19V22"),
            ),
            primaryPaths = listOf(
                IconPath("M7 8C7 5.23858 9.23858 3 12 3C14.7614 3 17 5.23858 17 8V11C17 13.7614 14.7614 16 12 16C9.23858 16 7 13.7614 7 11V8Z"),
            ),
        )
        return _microphone2!!
    }

private var _microphone2: SolarIcon? = null
