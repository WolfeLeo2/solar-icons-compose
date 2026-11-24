package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Rewind10SecondsBack: SolarIcon
    get() {
        if (_rewind10SecondsBack != null) return _rewind10SecondsBack!!
        _rewind10SecondsBack = SolarIcon(
            name = "Solar.Linear.Rewind10SecondsBack",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M14 4.5L12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 7.89936 4.46819 4.3752 8 2.83209"),
                IconPath("M7.5 10.5L10 8.5V15.5"),
                IconPath("M12.5 13.75V10.25C12.5 9.2835 13.2835 8.5 14.25 8.5C15.2165 8.5 16 9.2835 16 10.25V13.75C16 14.7165 15.2165 15.5 14.25 15.5C13.2835 15.5 12.5 14.7165 12.5 13.75Z"),
            ),
        )
        return _rewind10SecondsBack!!
    }

private var _rewind10SecondsBack: SolarIcon? = null
