package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Play: SolarIcon
    get() {
        if (_play != null) return _play!!
        _play = SolarIcon(
            name = "Solar.LineDuotone.Play",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20.4086 9.35258C22.5305 10.5065 22.5305 13.4935 20.4086 14.6474L7.59662 21.6145C5.53435 22.736 3 21.2763 3 18.9671L3 5.0329C3 2.72368 5.53435 1.26402 7.59661 2.38548L20.4086 9.35258Z"),
            ),
        )
        return _play!!
    }

private var _play: SolarIcon? = null
