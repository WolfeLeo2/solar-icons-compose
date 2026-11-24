package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.EndCallRounded: SolarIcon
    get() {
        if (_endCallRounded != null) return _endCallRounded!!
        _endCallRounded = SolarIcon(
            name = "Solar.LineDuotone.EndCallRounded",
            secondaryPaths = listOf(
                IconPath("M3.08301 10.5032C4.44035 9.03888 7.19334 7 12.0001 7C16.8069 7 19.5599 9.03889 20.9172 10.5032"),
                IconPath("M9 13.6185C9 13.6185 9 11.9639 12 11.9639C15 11.9639 15 13.6185 15 13.6185"),
            ),
            primaryPaths = listOf(
                IconPath("M3.08289 10.5032C2.27659 11.373 2 12.6127 2 13.8504C2 15.9102 3.78158 17.415 5.6072 16.8972L6.9469 16.5173C8.15591 16.1744 9 14.9826 9 13.6185M20.9171 10.5032C21.7234 11.373 22 12.6127 22 13.8504C22 15.9102 20.2184 17.415 18.3928 16.8972L17.0531 16.5173C15.8441 16.1744 15 14.9826 15 13.6185"),
            ),
        )
        return _endCallRounded!!
    }

private var _endCallRounded: SolarIcon? = null
