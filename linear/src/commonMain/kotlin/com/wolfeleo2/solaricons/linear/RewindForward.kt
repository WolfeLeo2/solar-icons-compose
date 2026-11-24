package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.RewindForward: SolarIcon
    get() {
        if (_rewindForward != null) return _rewindForward!!
        _rewindForward = SolarIcon(
            name = "Solar.Linear.RewindForward",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11 8.76844L4.90337 4.30838C3.60089 3.41122 2.00025 4.57895 2.00025 6.42632L2.00024 17.5737C2.00024 19.4211 3.60089 20.5888 4.90337 19.6916L11 15.2316"),
                IconPath("M21.0786 10.1468C22.3071 10.9545 22.3071 13.0455 21.0786 13.8532L13.6612 18.7302C12.4673 19.5152 11 18.4934 11 16.877L11 7.12303C11 5.50658 12.4673 4.48482 13.6612 5.26983L21.0786 10.1468Z"),
            ),
        )
        return _rewindForward!!
    }

private var _rewindForward: SolarIcon? = null
