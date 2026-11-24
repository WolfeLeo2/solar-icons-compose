package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SirenRounded: SolarIcon
    get() {
        if (_sirenRounded != null) return _sirenRounded!!
        _sirenRounded = SolarIcon(
            name = "Solar.LineDuotone.SirenRounded",
            secondaryPaths = listOf(
                IconPath("M20 22V16C20 11.5817 16.4183 8 12 8C7.58172 8 4 11.5817 4 16V22"),
                IconPath("M12 19V22"),
            ),
            primaryPaths = listOf(
                IconPath("M14.2905 11.5C15.2932 11.9059 16.0939 12.7065 16.4998 13.7092"),
                IconPath("M2 22H22"),
                IconPath("M12 2V5"),
                IconPath("M21 6L19.5 7.5"),
                IconPath("M3 6L4.5 7.5"),
                IconPath("M13.5 17.5C13.5 18.3284 12.8284 19 12 19C11.1716 19 10.5 18.3284 10.5 17.5C10.5 16.6716 11.1716 16 12 16C12.8284 16 13.5 16.6716 13.5 17.5Z"),
            ),
        )
        return _sirenRounded!!
    }

private var _sirenRounded: SolarIcon? = null
