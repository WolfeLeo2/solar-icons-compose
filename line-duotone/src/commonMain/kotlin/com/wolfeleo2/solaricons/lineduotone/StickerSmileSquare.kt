package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.StickerSmileSquare: SolarIcon
    get() {
        if (_stickerSmileSquare != null) return _stickerSmileSquare!!
        _stickerSmileSquare = SolarIcon(
            name = "Solar.LineDuotone.StickerSmileSquare",
            secondaryPaths = listOf(
                IconPath("M15 22H12C7.28595 22 4.92893 22 3.46447 20.5355C2 19.0711 2 16.714 2 12C2 7.28595 2 4.92893 3.46447 3.46447C4.92893 2 7.28595 2 12 2C16.714 2 19.0711 2 20.5355 3.46447C22 4.92893 22 7.28595 22 12V15M15 22C18.866 22 22 18.866 22 15M15 22C15 20.1387 15 19.2081 15.2447 18.4549C15.7393 16.9327 16.9327 15.7393 18.4549 15.2447C19.2081 15 20.1387 15 22 15"),
            ),
            primaryPaths = listOf(
                IconPath("M9 16C9.85038 16.6303 10.8846 17 12 17C13.1154 17 14.1496 16.6303 15 16"),
            ),
        )
        return _stickerSmileSquare!!
    }

private var _stickerSmileSquare: SolarIcon? = null
