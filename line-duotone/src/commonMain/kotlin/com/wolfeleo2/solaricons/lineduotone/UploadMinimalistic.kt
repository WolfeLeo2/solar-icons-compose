package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.UploadMinimalistic: SolarIcon
    get() {
        if (_uploadMinimalistic != null) return _uploadMinimalistic!!
        _uploadMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.UploadMinimalistic",
            secondaryPaths = listOf(
                IconPath("M3 15C3 17.8284 3 19.2426 3.87868 20.1213C4.75736 21 6.17157 21 9 21H15C17.8284 21 19.2426 21 20.1213 20.1213C21 19.2426 21 17.8284 21 15"),
            ),
            primaryPaths = listOf(
                IconPath("M12 16V3M12 3L16 7.375M12 3L8 7.375"),
            ),
        )
        return _uploadMinimalistic!!
    }

private var _uploadMinimalistic: SolarIcon? = null
