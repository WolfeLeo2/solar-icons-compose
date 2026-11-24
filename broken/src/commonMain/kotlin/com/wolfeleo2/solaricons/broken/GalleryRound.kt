package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.GalleryRound: SolarIcon
    get() {
        if (_galleryRound != null) return _galleryRound!!
        _galleryRound = SolarIcon(
            name = "Solar.Broken.GalleryRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16.0 6.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M2 10.1537L2.98073 10.0129C9.95896 9.01086 15.9238 15.0312 14.8571 21.9998"),
                IconPath("M22.0001 13.385L21.0266 13.2502C18.1829 12.8564 15.6098 14.2722 14.2847 16.5005"),
                IconPath("M22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C21.5093 4.43821 21.8356 5.80655 21.9449 8"),
            ),
        )
        return _galleryRound!!
    }

private var _galleryRound: SolarIcon? = null
