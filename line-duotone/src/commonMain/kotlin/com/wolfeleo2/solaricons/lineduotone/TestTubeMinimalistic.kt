package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.TestTubeMinimalistic: SolarIcon
    get() {
        if (_testTubeMinimalistic != null) return _testTubeMinimalistic!!
        _testTubeMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.TestTubeMinimalistic",
            secondaryPaths = listOf(
                IconPath("M6.80078 11.7834L8.075 11.9257C9.0977 12.0398 9.90504 12.8507 10.0187 13.8779C10.1062 14.6689 10.6104 15.3515 11.3386 15.665L13 16.3547"),
            ),
            primaryPaths = listOf(
                IconPath("M21 9.84867L14.1815 3M14.8635 3.68504L20.2387 9.08398L13 16.3547L9.48838 19.8818C8.00407 21.3727 5.59754 21.3727 4.11323 19.8818C2.62892 18.391 2.62892 15.9738 4.11323 14.4829L14.8635 3.68504Z"),
            ),
        )
        return _testTubeMinimalistic!!
    }

private var _testTubeMinimalistic: SolarIcon? = null
