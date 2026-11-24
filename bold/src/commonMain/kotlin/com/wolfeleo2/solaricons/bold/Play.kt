package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.Play: SolarIcon
    get() {
        if (_play != null) return _play!!
        _play = SolarIcon(
            name = "Solar.Bold.Play",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M21.4086 9.35258C23.5305 10.5065 23.5305 13.4935 21.4086 14.6474L8.59662 21.6145C6.53435 22.736 4 21.2763 4 18.9671L4 5.0329C4 2.72368 6.53435 1.26402 8.59661 2.38548L21.4086 9.35258Z"),
            ),
        )
        return _play!!
    }

private var _play: SolarIcon? = null
