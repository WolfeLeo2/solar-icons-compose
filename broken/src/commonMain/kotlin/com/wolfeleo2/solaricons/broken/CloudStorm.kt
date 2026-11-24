package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.CloudStorm: SolarIcon
    get() {
        if (_cloudStorm != null) return _cloudStorm!!
        _cloudStorm = SolarIcon(
            name = "Solar.Broken.CloudStorm",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M22 13.3529C22 15.2939 21.0091 17.0061 19.5 18.0226M14.381 8.02721C14.9767 7.81911 15.6178 7.70588 16.2857 7.70588C16.9404 7.70588 17.5693 7.81468 18.1551 8.01498M7.11616 10.6089C6.8475 10.5567 6.56983 10.5294 6.28571 10.5294C3.91878 10.5294 2 12.4256 2 14.7647C2 16.0746 2.60178 17.2457 3.54704 18.0226M7.11616 10.6089C6.88706 9.9978 6.7619 9.33687 6.7619 8.64706C6.7619 5.52827 9.32028 3 12.4762 3C15.4159 3 17.8371 5.19371 18.1551 8.01498M7.11616 10.6089C7.68059 10.7184 8.20528 10.9374 8.66667 11.2426M18.1551 8.01498C18.8381 8.24853 19.4623 8.60648 20 9.06141"),
                IconPath("M17 19L15 21"),
                IconPath("M15 15.5L13 17.5"),
                IconPath("M13 20L11 22"),
                IconPath("M6 22.3849L10.2857 18.6926H6L10.2857 15"),
            ),
        )
        return _cloudStorm!!
    }

private var _cloudStorm: SolarIcon? = null
