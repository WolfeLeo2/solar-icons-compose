package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Bug: SolarIcon
    get() {
        if (_bug != null) return _bug!!
        _bug = SolarIcon(
            name = "Solar.Linear.Bug",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M19 15V11.9375C19 9.76288 17.2371 8 15.0625 8H8.9375C6.76288 8 5 9.76288 5 11.9375V15C5 18.866 8.13401 22 12 22C15.866 22 19 18.866 19 15Z"),
                IconPath("M16.5 8.5V7.5C16.5 5.01472 14.4853 3 12 3C9.51472 3 7.5 5.01472 7.5 7.5V8.5"),
                IconPath("M19 14H22"),
                IconPath("M5 14H2"),
                IconPath("M14.5 3.5L17 2"),
                IconPath("M9.5 3.5L7 2"),
                IconPath("M20.5 20.0002L18.5 19.2002"),
                IconPath("M20.5 7.9998L18.5 8.7998"),
                IconPath("M3.5 20.0002L5.5 19.2002"),
                IconPath("M3.5 7.9998L5.5 8.7998"),
                IconPath("M12 21.5V15"),
            ),
        )
        return _bug!!
    }

private var _bug: SolarIcon? = null
