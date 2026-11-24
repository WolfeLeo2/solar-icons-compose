package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Share: SolarIcon
    get() {
        if (_share != null) return _share!!
        _share = SolarIcon(
            name = "Solar.LineDuotone.Share",
            secondaryPaths = listOf(
                IconPath("M14.3206 16.8014L9 13.2898"),
                IconPath("M14.4207 6.83972L9.1001 10.3513"),
            ),
            primaryPaths = listOf(
                IconPath("M9 11.5C9 12.8807 7.88071 14 6.5 14C5.11929 14 4 12.8807 4 11.5C4 10.1193 5.11929 9 6.5 9C7.88071 9 9 10.1193 9 11.5Z"),
                IconPath("M19 18.5C19 19.8807 17.8807 21 16.5 21C15.1193 21 14 19.8807 14 18.5C14 17.1193 15.1193 16 16.5 16C17.8807 16 19 17.1193 19 18.5Z"),
                IconPath("M19 5.5C19 6.88071 17.8807 8 16.5 8C15.1193 8 14 6.88071 14 5.5C14 4.11929 15.1193 3 16.5 3C17.8807 3 19 4.11929 19 5.5Z"),
            ),
        )
        return _share!!
    }

private var _share: SolarIcon? = null
