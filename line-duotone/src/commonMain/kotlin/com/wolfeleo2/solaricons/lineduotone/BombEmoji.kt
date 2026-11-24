package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.BombEmoji: SolarIcon
    get() {
        if (_bombEmoji != null) return _bombEmoji!!
        _bombEmoji = SolarIcon(
            name = "Solar.LineDuotone.BombEmoji",
            secondaryPaths = listOf(
                IconPath("M10 16L12 16"),
                IconPath("M14 12.5C14 13.3284 13.5523 14 13 14C12.4477 14 12 13.3284 12 12.5C12 11.6716 12.4477 11 13 11C13.5523 11 14 11.6716 14 12.5Z"),
                IconPath("M17 7L15 9"),
            ),
            primaryPaths = listOf(
                IconPath("M9.5 7.0 a7.5 7.5 0 1 0 0 15.0 a7.5 7.5 0 1 0 0 -15.0z"),
                IconPath("M17.9811 2.35316C18.1668 1.88228 18.8332 1.88228 19.0189 2.35316L19.6733 4.01242C19.73 4.15618 19.8438 4.26998 19.9876 4.32668L21.6468 4.98108C22.1177 5.16679 22.1177 5.83321 21.6468 6.01892L19.9876 6.67332C19.8438 6.73002 19.73 6.84382 19.6733 6.98758L19.0189 8.64684C18.8332 9.11772 18.1668 9.11772 17.9811 8.64684L17.3267 6.98758C17.27 6.84382 17.1562 6.73002 17.0124 6.67332L15.3532 6.01892C14.8823 5.83321 14.8823 5.16679 15.3532 4.98108L17.0124 4.32668C17.1562 4.26998 17.27 4.15618 17.3267 4.01242L17.9811 2.35316Z"),
            ),
        )
        return _bombEmoji!!
    }

private var _bombEmoji: SolarIcon? = null
