package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RewindForward: SolarIcon
    get() {
        if (_rewindForward != null) return _rewindForward!!
        _rewindForward = SolarIcon(
            name = "Solar.Broken.RewindForward",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10.9998 15.2316L4.90312 19.6916C3.60064 20.5888 2 19.4211 2 17.5737L2 15M10.9998 8.76844L4.90313 4.30838C3.60065 3.41122 2 4.57894 2 6.42631L2 11"),
                IconPath("M17.3699 7.70832L13.6612 5.26983C12.4673 4.48482 11 5.50658 11 7.12303L11 16.877C11 18.4934 12.4673 19.5152 13.6612 18.7302L21.0786 13.8532C22.3071 13.0455 22.3071 10.9545 21.0786 10.1468L20.1515 9.53719"),
            ),
        )
        return _rewindForward!!
    }

private var _rewindForward: SolarIcon? = null
