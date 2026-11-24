package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.BarChair: SolarIcon
    get() {
        if (_barChair != null) return _barChair!!
        _barChair = SolarIcon(
            name = "Solar.Broken.BarChair",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M5.0315 6.93751C4.75731 4.72857 6.30192 2.69766 8.54207 2.32168L8.93963 2.25496C10.9651 1.91501 13.0349 1.91501 15.0604 2.25496L15.4579 2.32168C17.6981 2.69766 19.2427 4.72857 18.9685 6.93751L18.9505 7.08273C18.8855 7.6063 18.4315 8 17.8928 8H6.10719C5.56847 8 5.11452 7.6063 5.04953 7.08273L5.0315 6.93751Z"),
                IconPath("M9 8L6 22"),
                IconPath("M15 8L15.75 11.5M18 22L16.5 15"),
                IconPath("M16.5 17H7.5"),
            ),
        )
        return _barChair!!
    }

private var _barChair: SolarIcon? = null
