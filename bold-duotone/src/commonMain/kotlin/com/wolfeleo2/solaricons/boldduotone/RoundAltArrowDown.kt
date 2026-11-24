package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.RoundAltArrowDown: SolarIcon
    get() {
        if (_roundAltArrowDown != null) return _roundAltArrowDown!!
        _roundAltArrowDown = SolarIcon(
            name = "Solar.BoldDuotone.RoundAltArrowDown",
            secondaryPaths = listOf(
                IconPath("M2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12Z"),
            ),
            primaryPaths = listOf(
                IconPath("M15.5303 11.0303C15.8232 10.7374 15.8232 10.2626 15.5303 9.96967C15.2374 9.67678 14.7626 9.67678 14.4697 9.96967L12 12.4393L9.53033 9.96967C9.23744 9.67678 8.76256 9.67678 8.46967 9.96967C8.17678 10.2626 8.17678 10.7374 8.46967 11.0303L11.4697 14.0303C11.7626 14.3232 12.2374 14.3232 12.5303 14.0303L15.5303 11.0303Z"),
            ),
        )
        return _roundAltArrowDown!!
    }

private var _roundAltArrowDown: SolarIcon? = null
