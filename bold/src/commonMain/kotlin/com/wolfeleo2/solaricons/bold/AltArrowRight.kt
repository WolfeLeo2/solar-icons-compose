package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.AltArrowRight: SolarIcon
    get() {
        if (_altArrowRight != null) return _altArrowRight!!
        _altArrowRight = SolarIcon(
            name = "Solar.Bold.AltArrowRight",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M15.8351 11.6296L9.20467 5.1999C8.79094 4.79869 8 5.04189 8 5.5703L8 18.4297C8 18.9581 8.79094 19.2013 9.20467 18.8001L15.8351 12.3704C16.055 12.1573 16.0549 11.8427 15.8351 11.6296Z"),
            ),
        )
        return _altArrowRight!!
    }

private var _altArrowRight: SolarIcon? = null
