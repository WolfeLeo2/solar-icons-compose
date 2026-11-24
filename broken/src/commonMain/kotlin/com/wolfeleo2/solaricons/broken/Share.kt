package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Share: SolarIcon
    get() {
        if (_share != null) return _share!!
        _share = SolarIcon(
            name = "Solar.Broken.Share",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 12C4 13.3807 5.11929 14.5 6.5 14.5C7.88071 14.5 9 13.3807 9 12C9 10.6193 7.88071 9.5 6.5 9.5"),
                IconPath("M14 6.5L9 10"),
                IconPath("M14 17.5L9 14"),
                IconPath("M16.5 21C17.8807 21 19 19.8807 19 18.5C19 17.1193 17.8807 16 16.5 16C15.1193 16 14 17.1193 14 18.5"),
                IconPath("M18.665 6.74999C17.9746 7.94572 16.4457 8.35541 15.2499 7.66505C14.0542 6.9747 13.6445 5.44572 14.3349 4.24999C15.0252 3.05426 16.5542 2.64457 17.7499 3.33493"),
            ),
        )
        return _share!!
    }

private var _share: SolarIcon? = null
