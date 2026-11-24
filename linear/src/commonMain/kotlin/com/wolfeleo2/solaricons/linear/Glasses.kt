package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Glasses: SolarIcon
    get() {
        if (_glasses != null) return _glasses!!
        _glasses = SolarIcon(
            name = "Solar.Linear.Glasses",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18.0 12.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M6.0 12.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
                IconPath("M14 16.2135L13.3441 15.9795C12.4749 15.6694 11.5252 15.6694 10.6559 15.9795L10 16.2135"),
                IconPath("M2 16L2.76315 7.60532C2.87807 6.34121 2.93553 5.70916 3.30554 5.24199C3.67554 4.77482 4.27763 4.57412 5.48181 4.17273L6 4"),
                IconPath("M22 16L21.2368 7.60532C21.1219 6.34121 21.0645 5.70916 20.6945 5.24199C20.3245 4.77482 19.7224 4.57412 18.5182 4.17273L18 4"),
            ),
        )
        return _glasses!!
    }

private var _glasses: SolarIcon? = null
