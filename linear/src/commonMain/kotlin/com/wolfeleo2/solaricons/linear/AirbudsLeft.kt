package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.AirbudsLeft: SolarIcon
    get() {
        if (_airbudsLeft != null) return _airbudsLeft!!
        _airbudsLeft = SolarIcon(
            name = "Solar.Linear.AirbudsLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 18.6667V19.5C2 20.8807 3.11929 22 4.5 22C5.88071 22 7 20.8807 7 19.5V18.6667M2 18.6667V7.625L2.00007 7.55936C2.01591 4.49563 4.49563 2.01591 7.55936 2.00007L7.625 2L7.66438 2.00004C9.50262 2.00954 10.9905 3.49738 11 5.33562L11 5.375V8C11 9.65685 9.65685 11 8 11C7.44772 11 7 11.4477 7 12V18.6667M2 18.6667H7"),
                IconPath("M8 5V8"),
                IconPath("M0.0 -5.5 a5.5 5.5 0 1 0 0 11.0 a5.5 5.5 0 1 0 0 -11.0z"),
                IconPath("M14 14V19H17"),
                IconPath("M14.0008 5.1001C15.9599 5.49778 17.5031 7.04095 17.9008 9.00008"),
            ),
        )
        return _airbudsLeft!!
    }

private var _airbudsLeft: SolarIcon? = null
