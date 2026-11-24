package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.MagniferZoomIn: SolarIcon
    get() {
        if (_magniferZoomIn != null) return _magniferZoomIn!!
        _magniferZoomIn = SolarIcon(
            name = "Solar.BoldDuotone.MagniferZoomIn",
            secondaryPaths = listOf(
                IconPath("M11.1566 20.3133C16.2137 20.3133 20.3133 16.2137 20.3133 11.1566C20.3133 6.09956 16.2137 2 11.1566 2C6.09956 2 2 6.09956 2 11.1566C2 16.2137 6.09956 20.3133 11.1566 20.3133Z"),
            ),
            primaryPaths = listOf(
                IconPath("M11.1565 8.02441C11.5557 8.02441 11.8793 8.34806 11.8793 8.74731V10.4341H13.5661C13.9653 10.4341 14.289 10.7577 14.289 11.1569C14.289 11.5562 13.9653 11.8798 13.5661 11.8798H11.8793V13.5666C11.8793 13.9658 11.5557 14.2895 11.1565 14.2895C10.7572 14.2895 10.4336 13.9658 10.4336 13.5666V11.8798H8.74682C8.34758 11.8798 8.02393 11.5562 8.02393 11.1569C8.02393 10.7577 8.34758 10.4341 8.74682 10.4341H10.4336V8.74731C10.4336 8.34806 10.7572 8.02441 11.1565 8.02441Z", PathFillType.EvenOdd),
                IconPath("M17.1001 18.1224L20.7664 21.7887C21.0487 22.071 21.5064 22.071 21.7887 21.7887C22.071 21.5064 22.071 21.0487 21.7887 20.7664L18.1224 17.1001C17.809 17.4671 17.4671 17.809 17.1001 18.1224Z"),
            ),
        )
        return _magniferZoomIn!!
    }

private var _magniferZoomIn: SolarIcon? = null
