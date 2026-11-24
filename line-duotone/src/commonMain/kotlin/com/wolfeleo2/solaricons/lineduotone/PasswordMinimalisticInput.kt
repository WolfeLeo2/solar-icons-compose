package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.PasswordMinimalisticInput: SolarIcon
    get() {
        if (_passwordMinimalisticInput != null) return _passwordMinimalisticInput!!
        _passwordMinimalisticInput = SolarIcon(
            name = "Solar.LineDuotone.PasswordMinimalisticInput",
            secondaryPaths = listOf(
                IconPath("M3.17157 18.8284C4.34315 20 6.22876 20 10 20H12L15 19.9991C18.1143 19.99 19.7653 19.8915 20.8284 18.8284C22 17.6569 22 15.7712 22 12C22 8.22876 22 6.34315 20.8284 5.17157C19.7653 4.10848 18.1143 4.01004 15 4.00093L12 4H10C6.22876 4 4.34315 4 3.17157 5.17157C2 6.34315 2 8.22876 2 12C2 15.7712 2 17.6569 3.17157 18.8284Z"),
            ),
            primaryPaths = listOf(
                IconPath("M9 12C9 12.5523 8.55228 13 8 13C7.44772 13 7 12.5523 7 12C7 11.4477 7.44772 11 8 11C8.55228 11 9 11.4477 9 12Z"),
                IconPath("M13 12C13 12.5523 12.5523 13 12 13C11.4477 13 11 12.5523 11 12C11 11.4477 11.4477 11 12 11C12.5523 11 13 11.4477 13 12Z"),
                IconPath("M15 2V22"),
            ),
        )
        return _passwordMinimalisticInput!!
    }

private var _passwordMinimalisticInput: SolarIcon? = null
