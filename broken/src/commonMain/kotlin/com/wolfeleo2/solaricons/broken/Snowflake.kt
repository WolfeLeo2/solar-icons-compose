package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Snowflake: SolarIcon
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = SolarIcon(
            name = "Solar.Broken.Snowflake",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2V18M12 22V18M12 18L15 21M12 18L9 21M15 3L12 6L9 3"),
                IconPath("M3.33978 6.99993L6.80389 8.99993M6.80389 8.99993L17.1962 14.9999M6.80389 8.99993L5.70581 4.90186M6.80389 8.99993L2.70581 10.098M17.1962 14.9999L20.6603 16.9999M17.1962 14.9999L21.2943 13.9019M17.1962 14.9999L18.2943 19.098"),
                IconPath("M20.66 6.99993L17.1959 8.99993M17.1959 8.99993L6.80364 14.9999M17.1959 8.99993L18.294 4.90186M17.1959 8.99993L21.294 10.098M6.80364 14.9999L3.33954 16.9999M6.80364 14.9999L2.70557 13.9019M6.80364 14.9999L5.70557 19.098"),
            ),
        )
        return _snowflake!!
    }

private var _snowflake: SolarIcon? = null
