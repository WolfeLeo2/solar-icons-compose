package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.StickerSmileCircle: SolarIcon
    get() {
        if (_stickerSmileCircle != null) return _stickerSmileCircle!!
        _stickerSmileCircle = SolarIcon(
            name = "Solar.Linear.StickerSmileCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 12C2 17.5228 6.47715 22 12 22C12.6477 22 13.2503 21.7004 13.7083 21.2424L21.2424 13.7083C21.7004 13.2503 22 12.6477 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12Z"),
                IconPath("M8.9126 15.9331C9.94668 16.1923 11.0951 16.2386 12.2688 16.0333"),
                IconPath("M12 22C12 19.2071 12 17.8107 12.3928 16.688C13.0964 14.6773 14.6773 13.0964 16.688 12.3928C17.8107 12 19.2071 12 22 12"),
            ),
        )
        return _stickerSmileCircle!!
    }

private var _stickerSmileCircle: SolarIcon? = null
