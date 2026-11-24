package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.RoundTransferDiagonal: SolarIcon
    get() {
        if (_roundTransferDiagonal != null) return _roundTransferDiagonal!!
        _roundTransferDiagonal = SolarIcon(
            name = "Solar.LineDuotone.RoundTransferDiagonal",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M6.5 4L13.8784 12V7.5"),
                IconPath("M17.3784 19.8779L9.87842 11.9995V16.4995"),
            ),
        )
        return _roundTransferDiagonal!!
    }

private var _roundTransferDiagonal: SolarIcon? = null
