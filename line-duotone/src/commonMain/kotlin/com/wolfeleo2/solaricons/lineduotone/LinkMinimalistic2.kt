package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.LinkMinimalistic2: SolarIcon
    get() {
        if (_linkMinimalistic2 != null) return _linkMinimalistic2!!
        _linkMinimalistic2 = SolarIcon(
            name = "Solar.LineDuotone.LinkMinimalistic2",
            secondaryPaths = listOf(
                IconPath("M14.1625 18.4876L13.4417 19.2084C11.053 21.5971 7.18019 21.5971 4.79151 19.2084C2.40283 16.8198 2.40283 12.9469 4.79151 10.5583L5.51236 9.8374"),
                IconPath("M9.8374 5.51236L10.5583 4.79151C12.9469 2.40283 16.8198 2.40283 19.2084 4.79151C21.5971 7.18019 21.5971 11.053 19.2084 13.4417L18.4876 14.1625"),
            ),
            primaryPaths = listOf(
                IconPath("M9.8374 14.1625L14.1625 9.8374"),
            ),
        )
        return _linkMinimalistic2!!
    }

private var _linkMinimalistic2: SolarIcon? = null
