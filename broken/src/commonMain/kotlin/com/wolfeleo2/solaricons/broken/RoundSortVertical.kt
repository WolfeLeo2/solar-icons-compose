package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.RoundSortVertical: SolarIcon
    get() {
        if (_roundSortVertical != null) return _roundSortVertical!!
        _roundSortVertical = SolarIcon(
            name = "Solar.Broken.RoundSortVertical",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9.5 8L9.5 16M9.5 16L7 13.25M9.5 16L12 13.25"),
                IconPath("M14.5 16L14.5 8M14.5 8L12 10.75M14.5 8L17 10.75"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _roundSortVertical!!
    }

private var _roundSortVertical: SolarIcon? = null
