package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Rewind15SecondsBack: SolarIcon
    get() {
        if (_rewind15SecondsBack != null) return _rewind15SecondsBack!!
        _rewind15SecondsBack = SolarIcon(
            name = "Solar.LineDuotone.Rewind15SecondsBack",
            secondaryPaths = listOf(
                IconPath("M14 4.5L12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 7.89936 4.46819 4.3752 8 2.83209"),
            ),
            primaryPaths = listOf(
                IconPath("M16.5 8.5H13.8604C13.6452 8.5 13.4541 8.63772 13.386 8.84189L12.7194 10.8419C12.6114 11.1657 12.8524 11.5 13.1937 11.5H14.5C15.6046 11.5 16.5 12.3954 16.5 13.5C16.5 14.6046 15.6046 15.5 14.5 15.5H12.5"),
                IconPath("M7.5 10.5L10 8.5V15.5"),
            ),
        )
        return _rewind15SecondsBack!!
    }

private var _rewind15SecondsBack: SolarIcon? = null
