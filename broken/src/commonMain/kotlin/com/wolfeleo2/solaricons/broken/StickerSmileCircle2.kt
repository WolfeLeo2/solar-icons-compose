package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.StickerSmileCircle2: SolarIcon
    get() {
        if (_stickerSmileCircle2 != null) return _stickerSmileCircle2!!
        _stickerSmileCircle2 = SolarIcon(
            name = "Solar.Broken.StickerSmileCircle2",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 12.6477 21.7004 13.2503 21.2424 13.7083L13.7083 21.2424C13.2503 21.7004 12.6477 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
                IconPath("M12 17C10.8846 17 9.85038 16.6303 9 16"),
                IconPath("M12 22C12 19.2071 12 17.8107 12.3928 16.688C13.0964 14.6773 14.6773 13.0964 16.688 12.3928C17.8107 12 19.2071 12 22 12"),
            ),
        )
        return _stickerSmileCircle2!!
    }

private var _stickerSmileCircle2: SolarIcon? = null
