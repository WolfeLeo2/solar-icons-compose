package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Record: SolarIcon
    get() {
        if (_record != null) return _record!!
        _record = SolarIcon(
            name = "Solar.BoldDuotone.Record",
            secondaryPaths = listOf(
                IconPath("M12.0 5.0 a7.0 7.0 0 1 0 0 14.0 a7.0 7.0 0 1 0 0 -14.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22ZM12 19C15.866 19 19 15.866 19 12C19 8.13401 15.866 5 12 5C8.13401 5 5 8.13401 5 12C5 15.866 8.13401 19 12 19Z", PathFillType.EvenOdd),
            ),
        )
        return _record!!
    }

private var _record: SolarIcon? = null
