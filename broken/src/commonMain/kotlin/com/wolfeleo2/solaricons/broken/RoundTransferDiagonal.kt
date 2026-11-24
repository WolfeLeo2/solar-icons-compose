package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RoundTransferDiagonal: SolarIcon
    get() {
        if (_roundTransferDiagonal != null) return _roundTransferDiagonal!!
        _roundTransferDiagonal = SolarIcon(
            name = "Solar.Broken.RoundTransferDiagonal",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M6.5 4L13.8784 12V7.5"),
                IconPath("M17.3784 19.8779L9.87842 11.9995V16.4995"),
                IconPath("M17 3.33782C15.5291 2.48697 13.8214 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 10.1786 21.513 8.47087 20.6622 7"),
            ),
        )
        return _roundTransferDiagonal!!
    }

private var _roundTransferDiagonal: SolarIcon? = null
