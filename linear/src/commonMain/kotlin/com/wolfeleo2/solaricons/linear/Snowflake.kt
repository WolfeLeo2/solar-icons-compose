package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Snowflake: SolarIcon
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = SolarIcon(
            name = "Solar.Linear.Snowflake",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 2V18M12 22V18M12 18L15 21M12 18L9 21M15 3L12 6L9 3"),
                IconPath("M3.33985 6.99993L6.80395 8.99993M6.80395 8.99993L17.1963 14.9999M6.80395 8.99993L5.70587 4.90186M6.80395 8.99993L2.70587 10.098M17.1963 14.9999L20.6604 16.9999M17.1963 14.9999L21.2943 13.9019M17.1963 14.9999L18.2943 19.098"),
                IconPath("M20.6602 6.99993L17.1961 8.99993M17.1961 8.99993L6.80375 14.9999M17.1961 8.99993L18.2941 4.90186M17.1961 8.99993L21.2941 10.098M6.80375 14.9999L3.33965 16.9999M6.80375 14.9999L2.70567 13.9019M6.80375 14.9999L5.70567 19.098"),
            ),
        )
        return _snowflake!!
    }

private var _snowflake: SolarIcon? = null
