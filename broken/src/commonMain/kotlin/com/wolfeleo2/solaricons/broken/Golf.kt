package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Golf: SolarIcon
    get() {
        if (_golf != null) return _golf!!
        _golf = SolarIcon(
            name = "Solar.Broken.Golf",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16.9785 21.5361C15.5125 21.8312 13.8126 22 12 22C6.47715 22 2 20.433 2 18.5C2 16.567 6.47715 15 12 15C17.5228 15 22 16.567 22 18.5C22 19.0476 21.6407 19.5659 21 20.0274"),
                IconPath("M12 18V2"),
                IconPath("M11.9998 3.5L17.4221 6.21114C18.9832 6.99169 19.7638 7.38196 19.7638 8C19.7638 8.61804 18.9832 9.00831 17.4221 9.78886L11.9998 12.5"),
            ),
        )
        return _golf!!
    }

private var _golf: SolarIcon? = null
