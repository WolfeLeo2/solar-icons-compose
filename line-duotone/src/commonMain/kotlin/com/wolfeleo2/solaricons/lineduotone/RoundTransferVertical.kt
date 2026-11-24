package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundTransferVertical: SolarIcon
    get() {
        if (_roundTransferVertical != null) return _roundTransferVertical!!
        _roundTransferVertical = SolarIcon(
            name = "Solar.LineDuotone.RoundTransferVertical",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M10 7L10 17L7 13.5625"),
                IconPath("M14 17L14 7L17 10.4375"),
            ),
        )
        return _roundTransferVertical!!
    }

private var _roundTransferVertical: SolarIcon? = null
