package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.BombMinimalistic: SolarIcon
    get() {
        if (_bombMinimalistic != null) return _bombMinimalistic!!
        _bombMinimalistic = SolarIcon(
            name = "Solar.Broken.BombMinimalistic",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M17 7L15 9"),
                IconPath("M19.5 7.5L20.5 8"),
                IconPath("M16 3.5L16.5 4.5"),
                IconPath("M19 5L20 4"),
                IconPath("M5.75 8.00337C6.85315 7.36523 8.13392 7 9.5 7C13.6421 7 17 10.3579 17 14.5C17 18.6421 13.6421 22 9.5 22C5.35786 22 2 18.6421 2 14.5C2 13.1339 2.36523 11.8532 3.00337 10.75"),
            ),
        )
        return _bombMinimalistic!!
    }

private var _bombMinimalistic: SolarIcon? = null
