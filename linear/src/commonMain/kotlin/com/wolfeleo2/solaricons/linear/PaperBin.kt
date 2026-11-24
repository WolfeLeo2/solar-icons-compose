package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.PaperBin: SolarIcon
    get() {
        if (_paperBin != null) return _paperBin!!
        _paperBin = SolarIcon(
            name = "Solar.Linear.PaperBin",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3.03353 8.89004C2.55299 5.68645 2.31272 4.08466 3.21037 3.04233C4.10801 2 5.72772 2 8.96715 2H15.0329C18.2723 2 19.892 2 20.7897 3.04233C21.6873 4.08466 21.4471 5.68646 20.9665 8.89004L19.7665 16.89C19.4009 19.3276 19.2181 20.5464 18.3741 21.2732C17.5302 22 16.2978 22 13.8329 22H10.1671C7.70228 22 6.46984 22 5.62592 21.2732C4.78199 20.5464 4.59917 19.3276 4.23353 16.89L3.03353 8.89004Z"),
                IconPath("M8 6L3.5 11L11 19M14 6L4 16M20 6L7 19M13 19L20.5 11L16 6M10 6L20 16M4 6L17 19"),
                IconPath("M21 6H3"),
                IconPath("M19 19H5"),
            ),
        )
        return _paperBin!!
    }

private var _paperBin: SolarIcon? = null
