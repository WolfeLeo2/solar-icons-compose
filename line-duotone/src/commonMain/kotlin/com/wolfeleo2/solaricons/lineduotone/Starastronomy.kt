package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Starastronomy: SolarIcon
    get() {
        if (_starastronomy != null) return _starastronomy!!
        _starastronomy = SolarIcon(
            name = "Solar.LineDuotone.Starastronomy",
            secondaryPaths = listOf(
                IconPath("M17.6569 6.34277L15.9599 8.03983M8.04029 15.9594L6.34323 17.6565M6.34302 6.34295L8.04007 8.04001M15.9597 15.9596L17.6567 17.6567"),
            ),
            primaryPaths = listOf(
                IconPath("M12 20V17.6M12 6.4V4M20 12H17.6M6.4 12H4"),
            ),
        )
        return _starastronomy!!
    }

private var _starastronomy: SolarIcon? = null
