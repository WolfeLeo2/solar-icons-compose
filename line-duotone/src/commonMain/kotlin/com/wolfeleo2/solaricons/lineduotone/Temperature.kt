package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Temperature: SolarIcon
    get() {
        if (_temperature != null) return _temperature!!
        _temperature = SolarIcon(
            name = "Solar.LineDuotone.Temperature",
            secondaryPaths = listOf(
                IconPath("M12 22C15.0376 22 17.5 19.5376 17.5 16.5C17.5 14.7636 16.6954 13.2152 15.4386 12.2072C15.1749 11.9957 15 11.6857 15 11.3477V5C15 3.34315 13.6569 2 12 2C10.3431 2 9 3.34315 9 5V11.3477C9 11.6857 8.82505 11.9957 8.56141 12.2072C7.30465 13.2152 6.5 14.7636 6.5 16.5C6.5 19.5376 8.96243 22 12 22Z"),
            ),
            primaryPaths = listOf(
                IconPath("M11.9998 13.9999C10.619 13.9999 9.49976 15.1192 9.49976 16.4999C9.49976 17.8806 10.619 18.9999 11.9998 18.9999C13.3805 18.9999 14.4998 17.8806 14.4998 16.4999C14.4998 15.1192 13.3805 13.9999 11.9998 13.9999ZM11.9998 13.9999L12 5"),
            ),
        )
        return _temperature!!
    }

private var _temperature: SolarIcon? = null
