package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.LetterUnread: SolarIcon
    get() {
        if (_letterUnread != null) return _letterUnread!!
        _letterUnread = SolarIcon(
            name = "Solar.LineDuotone.LetterUnread",
            secondaryPaths = listOf(
                IconPath("M22 10C22.0185 10.7271 22 11.0542 22 12C22 15.7712 22 17.6569 20.8284 18.8284C19.6569 20 17.7712 20 14 20H10C6.22876 20 4.34315 20 3.17157 18.8284C2 17.6569 2 15.7712 2 12C2 8.22876 2 6.34315 3.17157 5.17157C4.34315 4 6.22876 4 10 4H13"),
            ),
            primaryPaths = listOf(
                IconPath("M6 8L8.1589 9.79908C9.99553 11.3296 10.9139 12.0949 12 12.0949C13.0861 12.0949 14.0045 11.3296 15.8411 9.79908"),
                IconPath("M19.0 2.0 a3.0 3.0 0 1 0 0 6.0 a3.0 3.0 0 1 0 0 -6.0z"),
            ),
        )
        return _letterUnread!!
    }

private var _letterUnread: SolarIcon? = null
