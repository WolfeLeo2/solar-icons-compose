package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Rewind5SecondsForward: SolarIcon
    get() {
        if (_rewind5SecondsForward != null) return _rewind5SecondsForward!!
        _rewind5SecondsForward = SolarIcon(
            name = "Solar.Broken.Rewind5SecondsForward",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 4.5L12 2C6.47715 2 2 6.47715 2 12C2 12.6849 2.06886 13.3538 2.20004 14M16 2.83209C19.5318 4.3752 22 7.89936 22 12C22 17.5228 17.5228 22 12 22C8.72852 22 5.82443 20.4287 4 18"),
                IconPath("M14 8.5H11.3604C11.1452 8.5 10.9541 8.63772 10.886 8.84189L10.2194 10.8419C10.1114 11.1657 10.3524 11.5 10.6937 11.5H12C13.1046 11.5 14 12.3954 14 13.5C14 14.6046 13.1046 15.5 12 15.5H10"),
            ),
        )
        return _rewind5SecondsForward!!
    }

private var _rewind5SecondsForward: SolarIcon? = null
