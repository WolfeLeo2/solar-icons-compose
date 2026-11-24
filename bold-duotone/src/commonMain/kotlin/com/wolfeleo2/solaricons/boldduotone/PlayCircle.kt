package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.PlayCircle: SolarIcon
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = SolarIcon(
            name = "Solar.BoldDuotone.PlayCircle",
            secondaryPaths = listOf(
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22Z", PathFillType.EvenOdd),
            ),
            primaryPaths = listOf(
                IconPath("M15.4137 13.059L10.6935 15.8458C9.93371 16.2944 9 15.7105 9 14.7868V9.21316C9 8.28947 9.93371 7.70561 10.6935 8.15419L15.4137 10.941C16.1954 11.4026 16.1954 12.5974 15.4137 13.059Z"),
            ),
        )
        return _playCircle!!
    }

private var _playCircle: SolarIcon? = null
