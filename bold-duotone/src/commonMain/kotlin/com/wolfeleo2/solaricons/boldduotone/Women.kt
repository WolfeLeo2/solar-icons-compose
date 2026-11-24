package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Women: SolarIcon
    get() {
        if (_women != null) return _women!!
        _women = SolarIcon(
            name = "Solar.BoldDuotone.Women",
            secondaryPaths = listOf(
                IconPath("M12.0 2.0 a7.0 7.0 0 1 0 0 14.0 a7.0 7.0 0 1 0 0 -14.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M11.25 15.9604V17.7502H9.5C9.08579 17.7502 8.75 18.0859 8.75 18.5002C8.75 18.9144 9.08579 19.2502 9.5 19.2502H11.25V22.0002C11.25 22.4144 11.5858 22.7502 12 22.7502C12.4142 22.7502 12.75 22.4144 12.75 22.0002V19.2502H14.5C14.9142 19.2502 15.25 18.9144 15.25 18.5002C15.25 18.0859 14.9142 17.7502 14.5 17.7502L12.75 17.7502V15.9604C12.5036 15.9867 12.2534 16.0002 12 16.0002C11.7466 16.0002 11.4964 15.9867 11.25 15.9604Z"),
            ),
        )
        return _women!!
    }

private var _women: SolarIcon? = null
