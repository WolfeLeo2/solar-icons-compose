package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Men: SolarIcon
    get() {
        if (_men != null) return _men!!
        _men = SolarIcon(
            name = "Solar.Linear.Men",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M10.0 6.0 a8.0 8.0 0 1 0 0 16.0 a8.0 8.0 0 1 0 0 -16.0z"),
                IconPath("M22 2H22.75C22.75 1.58579 22.4142 1.25 22 1.25V2ZM21.25 7C21.25 7.41421 21.5858 7.75 22 7.75C22.4142 7.75 22.75 7.41421 22.75 7H21.25ZM17 1.25C16.5858 1.25 16.25 1.58579 16.25 2C16.25 2.41421 16.5858 2.75 17 2.75V1.25ZM16.0303 9.03033L22.5303 2.53033L21.4697 1.46967L14.9697 7.96967L16.0303 9.03033ZM21.25 2V7H22.75V2H21.25ZM17 2.75H22V1.25H17V2.75Z"),
            ),
        )
        return _men!!
    }

private var _men: SolarIcon? = null
