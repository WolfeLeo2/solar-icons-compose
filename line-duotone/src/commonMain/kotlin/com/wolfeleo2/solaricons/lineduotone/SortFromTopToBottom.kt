package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.SortFromTopToBottom: SolarIcon
    get() {
        if (_sortFromTopToBottom != null) return _sortFromTopToBottom!!
        _sortFromTopToBottom = SolarIcon(
            name = "Solar.LineDuotone.SortFromTopToBottom",
            secondaryPaths = listOf(
                IconPath("M6 11H13"),
                IconPath("M8 6L13 6"),
            ),
            primaryPaths = listOf(
                IconPath("M4 16L13 16"),
                IconPath("M17 4L17 20L20 16"),
            ),
        )
        return _sortFromTopToBottom!!
    }

private var _sortFromTopToBottom: SolarIcon? = null
