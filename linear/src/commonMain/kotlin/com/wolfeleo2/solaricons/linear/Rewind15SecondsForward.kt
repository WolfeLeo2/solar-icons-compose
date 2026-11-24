package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Rewind15SecondsForward: SolarIcon
    get() {
        if (_rewind15SecondsForward != null) return _rewind15SecondsForward!!
        _rewind15SecondsForward = SolarIcon(
            name = "Solar.Linear.Rewind15SecondsForward",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10 4.5L12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12C22 7.89936 19.5318 4.3752 16 2.83209"),
                IconPath("M16.5 8.5H13.8604C13.6452 8.5 13.4541 8.63772 13.386 8.84189L12.7194 10.8419C12.6114 11.1657 12.8524 11.5 13.1937 11.5H14.5C15.6046 11.5 16.5 12.3954 16.5 13.5C16.5 14.6046 15.6046 15.5 14.5 15.5H12.5"),
                IconPath("M7.5 10.5L10 8.5V15.5"),
            ),
        )
        return _rewind15SecondsForward!!
    }

private var _rewind15SecondsForward: SolarIcon? = null
