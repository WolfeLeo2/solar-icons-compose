package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.GalleryCircle: SolarIcon
    get() {
        if (_galleryCircle != null) return _galleryCircle!!
        _galleryCircle = SolarIcon(
            name = "Solar.LineDuotone.GalleryCircle",
            secondaryPaths = listOf(
                IconPath("M15.0 7.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M20 17.6001L17.7765 15.599C16.7369 14.6634 15.1888 14.5702 14.0446 15.3744L13.7464 15.5839C12.9513 16.1428 11.8695 16.0491 11.1822 15.3618L6.89249 11.0721C6.03628 10.2159 4.66287 10.1702 3.75159 10.9675L2.28113 12.2542"),
            ),
            primaryPaths = listOf(
                IconPath("M12.0 2.0 a10.0 10.0 0 1 0 0 20.0 a10.0 10.0 0 1 0 0 -20.0z"),
            ),
        )
        return _galleryCircle!!
    }

private var _galleryCircle: SolarIcon? = null
