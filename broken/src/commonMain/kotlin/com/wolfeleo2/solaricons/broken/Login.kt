package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Login: SolarIcon
    get() {
        if (_login != null) return _login!!
        _login = SolarIcon(
            name = "Solar.Broken.Login",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M20 12C20 7.58172 16.4183 4 12 4M12 20C14.5264 20 16.7792 18.8289 18.2454 17"),
                IconPath("M4 12H14M14 12L11 9M14 12L11 15"),
            ),
        )
        return _login!!
    }

private var _login: SolarIcon? = null
