package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.PresentationGraph: SolarIcon
    get() {
        if (_presentationGraph != null) return _presentationGraph!!
        _presentationGraph = SolarIcon(
            name = "Solar.Linear.PresentationGraph",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M2 2H22"),
                IconPath("M9 10.5L10.2929 9.20711C10.6262 8.87377 10.7929 8.70711 11 8.70711C11.2071 8.70711 11.3738 8.87377 11.7071 9.20711L12.2929 9.79289C12.6262 10.1262 12.7929 10.2929 13 10.2929C13.2071 10.2929 13.3738 10.1262 13.7071 9.79289L15 8.5"),
                IconPath("M12 21L12 17"),
                IconPath("M10 22L12 21"),
                IconPath("M14 22L12 21"),
                IconPath("M20 2V10.5C20 13.5641 20 15.0962 18.9958 16.0481C17.9916 17 16.3753 17 13.1429 17H10.8571C7.62465 17 6.00841 17 5.00421 16.0481C4 15.0962 4 13.5641 4 10.5V2"),
            ),
        )
        return _presentationGraph!!
    }

private var _presentationGraph: SolarIcon? = null
