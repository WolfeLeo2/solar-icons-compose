package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.AltArrowLeft: SolarIcon
    get() {
        if (_altArrowLeft != null) return _altArrowLeft!!
        _altArrowLeft = SolarIcon(
            name = "Solar.Bold.AltArrowLeft",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8.16485 11.6296L14.7953 5.1999C15.2091 4.79869 16 5.04189 16 5.5703L16 18.4297C16 18.9581 15.2091 19.2013 14.7953 18.8001L8.16485 12.3704C7.94505 12.1573 7.94505 11.8427 8.16485 11.6296Z"),
            ),
        )
        return _altArrowLeft!!
    }

private var _altArrowLeft: SolarIcon? = null
