package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SsdRound: SolarIcon
    get() {
        if (_ssdRound != null) return _ssdRound!!
        _ssdRound = SolarIcon(
            name = "Solar.Linear.SsdRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21.5534 15.4813L19 5.11765C18.5 3.52941 17.6046 3 16.5 3H7.5C6.39543 3 5.5 3.52941 5 5.11765L2.44664 15.4813M21.5534 15.4813C20.9538 14.3515 19.8111 13.5882 18.5 13.5882H5.5C4.18893 13.5882 3.04623 14.3515 2.44664 15.4813M21.5534 15.4813C21.8378 16.0172 22 16.6356 22 17.2941C22 19.3408 20.433 21 18.5 21H5.5C3.567 21 2 19.3408 2 17.2941C2 16.6356 2.16221 16.0172 2.44664 15.4813"),
                IconPath("M18 17V18"),
                IconPath("M15.5 17V18"),
                IconPath("M13 17V18"),
                IconPath("M10.5 17V18"),
            ),
        )
        return _ssdRound!!
    }

private var _ssdRound: SolarIcon? = null
