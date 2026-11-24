package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.WirelessCharge: SolarIcon
    get() {
        if (_wirelessCharge != null) return _wirelessCharge!!
        _wirelessCharge = SolarIcon(
            name = "Solar.Broken.WirelessCharge",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M11.25 22C11.25 22.4142 11.5858 22.75 12 22.75C12.4142 22.75 12.75 22.4142 12.75 22H11.25ZM11.25 21V22H12.75V21H11.25Z"),
                IconPath("M12.8569 7L9.99972 10H13.9997L11.1426 13"),
                IconPath("M13.5 18V19.5C13.5 19.9659 13.5 20.1989 13.4239 20.3827C13.3224 20.6277 13.1277 20.8224 12.8827 20.9239C12.6989 21 12.4659 21 12 21C11.5341 21 11.3011 21 11.1173 20.9239C10.8723 20.8224 10.6776 20.6277 10.5761 20.3827C10.5 20.1989 10.5 19.9659 10.5 19.5V18"),
                IconPath("M4.58152 7C4.20651 7.92643 4 8.9391 4 10C4 14.4183 7.58172 18 12 18C16.4183 18 20 14.4183 20 10C20 5.58172 16.4183 2 12 2C10.9391 2 9.92643 2.20651 9 2.58152"),
            ),
        )
        return _wirelessCharge!!
    }

private var _wirelessCharge: SolarIcon? = null
