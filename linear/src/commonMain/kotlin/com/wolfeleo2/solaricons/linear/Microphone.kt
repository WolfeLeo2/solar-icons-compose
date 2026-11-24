package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Microphone: SolarIcon
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = SolarIcon(
            name = "Solar.Linear.Microphone",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 8C7 5.23858 9.23858 3 12 3C14.7614 3 17 5.23858 17 8V11C17 13.7614 14.7614 16 12 16C9.23858 16 7 13.7614 7 11V8Z"),
                IconPath("M13 8L17 8"),
                IconPath("M13 11L17 11"),
                IconPath("M20 10V11C20 15.4183 16.4183 19 12 19C7.58172 19 4 15.4183 4 11V10"),
                IconPath("M12 19V22"),
            ),
        )
        return _microphone!!
    }

private var _microphone: SolarIcon? = null
