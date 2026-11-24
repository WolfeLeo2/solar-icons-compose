package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SmartphoneRotateOrientation: SolarIcon
    get() {
        if (_smartphoneRotateOrientation != null) return _smartphoneRotateOrientation!!
        _smartphoneRotateOrientation = SolarIcon(
            name = "Solar.Broken.SmartphoneRotateOrientation",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 14V16C2 18.8284 2 20.2426 2.87868 21.1213C3.75736 22 5.17157 22 8 22H9C11.8284 22 13.2426 22 14.1213 21.1213C15 20.2426 15 18.8284 15 16V8C15 5.17157 15 3.75736 14.1213 2.87868C13.2426 2 11.8284 2 9 2H8C5.17157 2 3.75736 2 2.87868 2.87868C2 3.75736 2 5.17157 2 8V10"),
                IconPath("M17.5 10.0063C19.3597 10.0333 20.414 10.1712 21.1213 10.8785C22 11.7572 22 13.1714 22 15.9998C22 18.8283 22 20.2425 21.1213 21.1212C20.414 21.8285 19.3597 21.9664 17.5 21.9933"),
                IconPath("M11 5H6"),
                IconPath("M19 18V14"),
                IconPath("M10 17.5C10 18.3284 9.32843 19 8.5 19C7.67157 19 7 18.3284 7 17.5C7 16.6716 7.67157 16 8.5 16C9.32843 16 10 16.6716 10 17.5Z"),
                IconPath("M20.5 6.98598L22 8C22 4.98532 19.8377 2.48275 17 2"),
            ),
        )
        return _smartphoneRotateOrientation!!
    }

private var _smartphoneRotateOrientation: SolarIcon? = null
