package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Database: SolarIcon
    get() {
        if (_database != null) return _database!!
        _database = SolarIcon(
            name = "Solar.Broken.Database",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M4 18V6"),
                IconPath("M20 12L20 18"),
                IconPath("M12 10C16.4183 10 20 8.20914 20 6C20 3.79086 16.4183 2 12 2C7.58172 2 4 3.79086 4 6C4 8.20914 7.58172 10 12 10Z"),
                IconPath("M20 12C20 14.2091 16.4183 16 12 16C7.58172 16 4 14.2091 4 12"),
                IconPath("M20 18C20 20.2091 16.4183 22 12 22C7.58172 22 4 20.2091 4 18"),
            ),
        )
        return _database!!
    }

private var _database: SolarIcon? = null
