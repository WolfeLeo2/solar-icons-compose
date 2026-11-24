package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.LaptopMinimalistic: SolarIcon
    get() {
        if (_laptopMinimalistic != null) return _laptopMinimalistic!!
        _laptopMinimalistic = SolarIcon(
            name = "Solar.BoldDuotone.LaptopMinimalistic",
            secondaryPaths = listOf(
                IconPath("M3.69013 3.8904C2.79102 4.78079 2.79102 6.21386 2.79102 9.08V14.1467C2.79102 16.0574 2.79102 17.0128 3.39042 17.6064C3.98983 18.2 4.95457 18.2 6.88404 18.2H17.1166C19.0461 18.2 20.0108 18.2 20.6102 17.6064C21.2096 17.0128 21.2096 16.0574 21.2096 14.1467V9.08C21.2096 6.21386 21.2096 4.78079 20.3105 3.8904C19.4114 3 17.9643 3 15.0701 3H8.93055C6.03635 3 4.58924 3 3.69013 3.8904Z"),
            ),
            primaryPaths = listOf(
                IconPath("M1 20.24C1 19.8202 1.3436 19.48 1.76744 19.48H22.2326C22.6564 19.48 23 19.8202 23 20.24C23 20.6597 22.6564 21 22.2326 21H1.76744C1.3436 21 1 20.6597 1 20.24Z", PathFillType.EvenOdd),
                IconPath("M8.93053 14.4004C8.50668 14.4004 8.16309 14.7407 8.16309 15.1604C8.16309 15.5801 8.50668 15.9204 8.93053 15.9204H15.0701C15.4939 15.9204 15.8375 15.5801 15.8375 15.1604C15.8375 14.7407 15.4939 14.4004 15.0701 14.4004H8.93053Z"),
            ),
        )
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: SolarIcon? = null
