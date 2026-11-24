package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Gift: SolarIcon
    get() {
        if (_gift != null) return _gift!!
        _gift = SolarIcon(
            name = "Solar.Broken.Gift",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 12H2"),
                IconPath("M12 2V22"),
                IconPath("M13 12C13 14.2091 14.7909 16 17 16"),
                IconPath("M11 12C11 14.2091 9.20914 16 7 16"),
                IconPath("M12 10.035C12 8.54516 13.014 7.24647 14.4594 6.88512C16.0631 6.48419 17.5158 7.93685 17.1148 9.54058C16.7535 10.986 15.4548 12 13.9649 12H12V10.035Z"),
                IconPath("M12.0001 10.035C12.0001 8.54516 10.9861 7.24647 9.5407 6.88512C7.93698 6.48419 6.48431 7.93685 6.88524 9.54058C7.24659 10.986 8.54529 12 10.0352 12H12.0001V10.035Z"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _gift!!
    }

private var _gift: SolarIcon? = null
