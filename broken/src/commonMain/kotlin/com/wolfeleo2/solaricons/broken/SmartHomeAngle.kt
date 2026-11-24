package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SmartHomeAngle: SolarIcon
    get() {
        if (_smartHomeAngle != null) return _smartHomeAngle!!
        _smartHomeAngle = SolarIcon(
            name = "Solar.Broken.SmartHomeAngle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21.6359 12.9581L21.3572 14.8954C20.8697 18.2828 20.626 19.9766 19.451 20.9884C18.3822 21.9086 16.8599 21.9919 14 21.9994M21.6646 7.87513C21.1242 6.74779 19.9738 6.06252 17.6731 4.69199L16.2882 3.86705C14.199 2.62247 13.1543 2.00018 12 2.00018C10.8457 2.00018 9.80104 2.62247 7.71175 3.86705L6.32691 4.69199C4.02619 6.06252 2.87583 6.74779 2.33537 7.87513C2.04852 8.47345 1.96736 9.12562 2.01108 10.0002"),
                IconPath("M11 22C11 17.0294 6.97056 13 2 13"),
                IconPath("M8 22C8 18.6863 5.31371 16 2 16"),
                IconPath("M5 22C5 20.3431 3.65685 19 2 19"),
            ),
        )
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: SolarIcon? = null
