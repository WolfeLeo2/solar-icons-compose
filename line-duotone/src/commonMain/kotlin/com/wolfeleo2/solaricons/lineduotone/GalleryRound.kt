package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.GalleryRound: SolarIcon
    get() {
        if (_galleryRound != null) return _galleryRound!!
        _galleryRound = SolarIcon(
            name = "Solar.LineDuotone.GalleryRound",
            secondaryPaths = listOf(
                IconPath("M16.0 6.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M2 10.1537L2.98073 10.0129C9.95896 9.01086 15.9238 15.0312 14.8571 21.9998M22 13.3845L21.0266 13.2497C18.1828 12.8559 15.6097 14.2717 14.2846 16.5"),
            ),
            primaryPaths = listOf(
                IconPath("M2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12C22 16.714 22 19.0711 20.5355 20.5355C19.0711 22 16.714 22 12 22C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12Z"),
            ),
        )
        return _galleryRound!!
    }

private var _galleryRound: SolarIcon? = null
