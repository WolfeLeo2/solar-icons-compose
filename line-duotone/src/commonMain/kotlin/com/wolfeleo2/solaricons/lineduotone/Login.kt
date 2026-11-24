package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Login: SolarIcon
    get() {
        if (_login != null) return _login!!
        _login = SolarIcon(
            name = "Solar.LineDuotone.Login",
            secondaryPaths = listOf(
                IconPath("M12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4"),
            ),
            primaryPaths = listOf(
                IconPath("M4 12H14M14 12L11 9M14 12L11 15"),
            ),
        )
        return _login!!
    }

private var _login: SolarIcon? = null
