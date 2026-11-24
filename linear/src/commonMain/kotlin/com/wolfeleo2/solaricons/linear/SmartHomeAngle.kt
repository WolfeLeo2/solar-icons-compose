package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.SmartHomeAngle: SolarIcon
    get() {
        if (_smartHomeAngle != null) return _smartHomeAngle!!
        _smartHomeAngle = SolarIcon(
            name = "Solar.Linear.SmartHomeAngle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2.01096 10.0002C1.96724 9.12562 2.0484 8.47345 2.33524 7.87513C2.8757 6.74779 4.02607 6.06252 6.32679 4.69199L7.71163 3.86705C9.80092 2.62247 10.8456 2.00018 11.9999 2.00018C13.1542 2.00018 14.1988 2.62247 16.2881 3.86705L17.673 4.69199C19.9737 6.06252 21.1241 6.74779 21.6645 7.87513C22.205 9.00247 22.0153 10.321 21.6358 12.9581L21.357 14.8954C20.8696 18.2828 20.6259 19.9766 19.4509 20.9884C18.3821 21.9086 16.8598 21.9919 13.9999 21.9994"),
                IconPath("M11 22C11 17.0294 6.97056 13 2 13"),
                IconPath("M8 22C8 18.6863 5.31371 16 2 16"),
                IconPath("M5 22C5 20.3431 3.65685 19 2 19"),
            ),
        )
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: SolarIcon? = null
