package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.Basketball: SolarIcon
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = SolarIcon(
            name = "Solar.Broken.Basketball",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M16.9498 20.5732C16.9498 20.5732 16.0108 13.982 14.0005 10.5C11.9901 7.01798 7.05029 3.42676 7.05029 3.42676"),
                IconPath("M21.8635 12.5799C16.4526 11.3928 9.05879 16.3475 7.57715 20.8172"),
                IconPath("M16.4141 3.20884C14.9262 7.6299 7.67443 12.5122 2.28877 11.4515"),
                IconPath("M7 3.33782C8.47087 2.48697 10.1786 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 10.1786 2.48697 8.47087 3.33782 7"),
            ),
        )
        return _basketball!!
    }

private var _basketball: SolarIcon? = null
