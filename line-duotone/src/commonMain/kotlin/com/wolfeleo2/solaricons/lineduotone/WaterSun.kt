package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.WaterSun: SolarIcon
    get() {
        if (_waterSun != null) return _waterSun!!
        _waterSun = SolarIcon(
            name = "Solar.LineDuotone.WaterSun",
            secondaryPaths = listOf(
                IconPath("M22 16.7723C20.4123 16.3982 19.5955 15.4791 18.9199 14.4569C18.4965 13.8163 17.5655 13.8553 17.1055 14.4701C16.0541 15.8757 14.4844 16.9999 12 16.9999C9.49345 16.9999 7.91806 15.5695 6.86651 14.2234C6.42721 13.6611 5.58617 13.6686 5.20168 14.2697C4.50078 15.3655 3.68402 16.3755 2 16.7723"),
                IconPath("M19.0703 4.9292L18.6775 5.32204"),
                IconPath("M5.32227 5.32178L4.92943 4.92894"),
            ),
            primaryPaths = listOf(
                IconPath("M22 21.7723C20.4123 21.3982 19.5955 20.4791 18.9199 19.4569C18.4965 18.8163 17.5655 18.8553 17.1055 19.4701C16.0541 20.8757 14.4844 21.9999 12 21.9999C9.49345 21.9999 7.91806 20.5695 6.86651 19.2234C6.42721 18.6611 5.58617 18.6686 5.20168 19.2697C4.50078 20.3655 3.68402 21.3755 2 21.7723"),
                IconPath("M17.9171 11C17.441 8.16229 14.973 6 12 6C9.02705 6 6.55909 8.16229 6.08301 11"),
                IconPath("M12 2V3"),
                IconPath("M22 12L21 12"),
                IconPath("M3 12L2 12"),
            ),
        )
        return _waterSun!!
    }

private var _waterSun: SolarIcon? = null
