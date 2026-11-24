package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Play: SolarIcon
    get() {
        if (_play != null) return _play!!
        _play = SolarIcon(
            name = "Solar.BoldDuotone.Play",
            secondaryPaths = listOf(
                IconPath("M8.59662 21.6145L21.4086 14.6474C22.4695 14.0705 23 13.0352 23 12H4L4 18.9671C4 21.2763 6.53435 22.736 8.59662 21.6145Z"),
            ),
            primaryPaths = listOf(
                IconPath("M23 12C23 10.9648 22.4695 9.92953 21.4086 9.35258L8.59661 2.38548C6.53435 1.26402 4 2.72368 4 5.0329L4 12H23Z", PathFillType.EvenOdd),
            ),
        )
        return _play!!
    }

private var _play: SolarIcon? = null
