package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.PaperclipRounded2: SolarIcon
    get() {
        if (_paperclipRounded2 != null) return _paperclipRounded2!!
        _paperclipRounded2 = SolarIcon(
            name = "Solar.Linear.PaperclipRounded2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.9502 11.0087L10.0104 13.9351C8.38687 15.5513 8.38687 18.1716 10.0104 19.7879C11.634 21.4041 14.2664 21.4041 15.8899 19.7879L19.5646 16.1299C22.8118 12.8975 22.8118 7.6567 19.5646 4.4243C16.3175 1.1919 11.0528 1.1919 7.80563 4.4243L4.13095 8.08229C1.28968 10.9106 1.28968 15.4963 4.13095 18.3247"),
            ),
        )
        return _paperclipRounded2!!
    }

private var _paperclipRounded2: SolarIcon? = null
