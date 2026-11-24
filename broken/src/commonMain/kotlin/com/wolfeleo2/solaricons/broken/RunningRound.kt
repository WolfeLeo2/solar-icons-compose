package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RunningRound: SolarIcon
    get() {
        if (_runningRound != null) return _runningRound!!
        _runningRound = SolarIcon(
            name = "Solar.Broken.RunningRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M18.5 2.0 a2.5 2.5 0 1 0 0 5.0 a2.5 2.5 0 1 0 0 -5.0z"),
                IconPath("M14.4 22.0001V21.195C14.4 21.1172 14.4 21.0783 14.3996 21.0414C14.377 18.902 13.3773 16.8905 11.6857 15.5807C11.6565 15.558 11.6255 15.5345 11.5635 15.4876C11.5235 15.4573 11.5035 15.4421 11.4877 15.4296C10.5309 14.6741 10.467 13.2456 11.3524 12.4075C11.367 12.3937 11.3857 12.3767 11.4227 12.3431L12.4628 11.3976C14.0898 9.91846 13.5945 7.24469 11.5457 6.44644C10.8122 6.16068 9.99522 6.17865 9.27504 6.49637L8.75335 6.72653M5.43897 8.61171L4 9.63643"),
                IconPath("M9 17L8.74064 17.3112C7.32089 19.0149 5.21773 20 3 20"),
                IconPath("M16 12C17.3131 12.3283 18.6869 12.3283 20 12"),
            ),
        )
        return _runningRound!!
    }

private var _runningRound: SolarIcon? = null
