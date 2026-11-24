package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Figma: SolarIcon
    get() {
        if (_figma != null) return _figma!!
        _figma = SolarIcon(
            name = "Solar.Linear.Figma",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2H8.66665C6.8257 2 5.33331 3.49238 5.33331 5.33333C5.33331 7.17428 6.8257 8.66667 8.66665 8.66667H12V2Z"),
                IconPath("M12 8.66669H8.66665C6.8257 8.66669 5.33331 10.1591 5.33331 12C5.33331 13.841 6.8257 15.3334 8.66665 15.3334H12V8.66669Z"),
                IconPath("M18.6667 12C18.6667 13.841 17.1743 15.3334 15.3333 15.3334C13.4924 15.3334 12 13.841 12 12C12 10.1591 13.4924 8.66669 15.3333 8.66669C17.1743 8.66669 18.6667 10.1591 18.6667 12Z"),
                IconPath("M8.66665 15.3333H12V18.6666C12 20.5076 10.5076 22 8.66665 22C6.8257 22 5.33331 20.5076 5.33331 18.6666C5.33331 16.8257 6.8257 15.3333 8.66665 15.3333Z"),
                IconPath("M12 2H15.3333C17.1743 2 18.6667 3.49238 18.6667 5.33333C18.6667 7.17428 17.1743 8.66667 15.3333 8.66667H12V2Z"),
            ),
        )
        return _figma!!
    }

private var _figma: SolarIcon? = null
