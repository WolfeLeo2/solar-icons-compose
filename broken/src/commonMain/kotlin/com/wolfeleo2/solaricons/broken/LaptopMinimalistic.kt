package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.LaptopMinimalistic: SolarIcon
    get() {
        if (_laptopMinimalistic != null) return _laptopMinimalistic!!
        _laptopMinimalistic = SolarIcon(
            name = "Solar.Broken.LaptopMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 10V14C3 15.8856 3 16.8284 3.58579 17.4142C4.17157 18 5.11438 18 7 18H17C18.8856 18 19.8284 18 20.4142 17.4142C21 16.8284 21 15.8856 21 14V9C21 6.17157 21 4.75736 20.1213 3.87868C19.2426 3 17.8284 3 15 3H9C6.17157 3 4.75736 3 3.87868 3.87868C3.38879 4.36857 3.17203 5.02491 3.07612 6"),
                IconPath("M22 21H16M2 21H12"),
                IconPath("M15 15H9"),
            ),
        )
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: SolarIcon? = null
