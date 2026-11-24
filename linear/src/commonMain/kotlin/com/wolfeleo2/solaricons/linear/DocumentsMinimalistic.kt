package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.DocumentsMinimalistic: SolarIcon
    get() {
        if (_documentsMinimalistic != null) return _documentsMinimalistic!!
        _documentsMinimalistic = SolarIcon(
            name = "Solar.Linear.DocumentsMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M5 8C5 5.17157 5 3.75736 5.87868 2.87868C6.75736 2 8.17157 2 11 2H13C15.8284 2 17.2426 2 18.1213 2.87868C19 3.75736 19 5.17157 19 8V16C19 18.8284 19 20.2426 18.1213 21.1213C17.2426 22 15.8284 22 13 22H11C8.17157 22 6.75736 22 5.87868 21.1213C5 20.2426 5 18.8284 5 16V8Z"),
                IconPath("M9 13H15"),
                IconPath("M9 9H15"),
                IconPath("M9 17H12"),
                IconPath("M2 19V5"),
                IconPath("M22 19V5"),
            ),
        )
        return _documentsMinimalistic!!
    }

private var _documentsMinimalistic: SolarIcon? = null
