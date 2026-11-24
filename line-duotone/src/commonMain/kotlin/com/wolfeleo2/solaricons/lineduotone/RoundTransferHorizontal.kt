package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundTransferHorizontal: SolarIcon
    get() {
        if (_roundTransferHorizontal != null) return _roundTransferHorizontal!!
        _roundTransferHorizontal = SolarIcon(
            name = "Solar.LineDuotone.RoundTransferHorizontal",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M17 10L7 10L10.4375 7"),
                IconPath("M7 14L17 14L13.5625 17"),
            ),
        )
        return _roundTransferHorizontal!!
    }

private var _roundTransferHorizontal: SolarIcon? = null
