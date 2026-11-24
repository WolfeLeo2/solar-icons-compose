package com.wolfeleo2.solaricons.outline

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Outline.AltArrowUp: SolarIcon
    get() {
        if (_altArrowUp != null) return _altArrowUp!!
        _altArrowUp = SolarIcon(
            name = "Solar.Outline.AltArrowUp",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.5119 8.43056C11.7928 8.18981 12.2072 8.18981 12.4881 8.43056L19.4881 14.4306C19.8026 14.7001 19.839 15.1736 19.5695 15.4881C19.2999 15.8026 18.8264 15.839 18.5119 15.5694L12 9.98781L5.48811 15.5694C5.17361 15.839 4.70014 15.8026 4.43057 15.4881C4.161 15.1736 4.19743 14.7001 4.51192 14.4306L11.5119 8.43056Z", PathFillType.EvenOdd),
            ),
        )
        return _altArrowUp!!
    }

private var _altArrowUp: SolarIcon? = null
