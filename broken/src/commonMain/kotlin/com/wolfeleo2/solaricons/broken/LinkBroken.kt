package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.LinkBroken: SolarIcon
    get() {
        if (_linkBroken != null) return _linkBroken!!
        _linkBroken = SolarIcon(
            name = "Solar.Broken.LinkBroken",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 8L8 10"),
                IconPath("M6 4L8 7"),
                IconPath("M11 6.56252L14.7001 2.93755C16.1597 1.50753 18.7629 1.73938 20.5145 3.4554M18.1358 12L21.043 9.15178C21.6325 8.57431 21.9453 7.81414 21.9934 7"),
                IconPath("M15 15.5866L10.9653 20.001C9.57254 21.5247 7.0887 21.2777 5.41744 19.4492C3.74618 17.6207 3.52038 14.9032 4.91309 13.3795L6.17395 12"),
            ),
        )
        return _linkBroken!!
    }

private var _linkBroken: SolarIcon? = null
