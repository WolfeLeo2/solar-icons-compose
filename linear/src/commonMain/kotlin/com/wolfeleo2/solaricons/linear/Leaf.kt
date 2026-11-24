package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Leaf: SolarIcon
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = SolarIcon(
            name = "Solar.Linear.Leaf",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.9999 9L16.4999 4.5M11.9999 14.5L18.4999 8M11.9999 19.5L19.4999 12"),
                IconPath("M12 22C16.4183 22 20 18.3541 20 13.8567C20 9.39453 17.4467 4.18759 13.4629 2.32555C12.9986 2.10852 12.4993 2 12 2M12 22C7.58172 22 4 18.3541 4 13.8567C4 9.39453 6.55332 4.18759 10.5371 2.32555C11.0014 2.10852 11.5007 2 12 2M12 22V2"),
            ),
        )
        return _leaf!!
    }

private var _leaf: SolarIcon? = null
