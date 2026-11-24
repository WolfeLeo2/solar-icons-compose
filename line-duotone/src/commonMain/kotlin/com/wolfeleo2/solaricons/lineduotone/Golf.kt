package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Golf: SolarIcon
    get() {
        if (_golf != null) return _golf!!
        _golf = SolarIcon(
            name = "Solar.LineDuotone.Golf",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 18V2"),
                IconPath("M11.9999 3.5L17.4222 6.21114C18.9834 6.99169 19.7639 7.38196 19.7639 8C19.7639 8.61804 18.9834 9.00831 17.4222 9.78886L11.9999 12.5"),
            ),
        )
        return _golf!!
    }

private var _golf: SolarIcon? = null
