package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.MedicalKit: SolarIcon
    get() {
        if (_medicalKit != null) return _medicalKit!!
        _medicalKit = SolarIcon(
            name = "Solar.LineDuotone.MedicalKit",
            secondaryPaths = listOf(
                IconPath("M16 6C16 4.11438 16 3.17157 15.4142 2.58579C14.8284 2 13.8856 2 12 2C10.1144 2 9.17157 2 8.58579 2.58579C8 3.17157 8 4.11438 8 6"),
                IconPath("M12.0 10.0 a4.0 4.0 0 1 0 0 8.0 a4.0 4.0 0 1 0 0 -8.0z"),
            ),
            primaryPaths = listOf(
                IconPath("M2 14C2 10.2288 2 8.34315 3.17157 7.17157C4.34315 6 6.22876 6 10 6H14C17.7712 6 19.6569 6 20.8284 7.17157C22 8.34315 22 10.2288 22 14C22 17.7712 22 19.6569 20.8284 20.8284C19.6569 22 17.7712 22 14 22H10C6.22876 22 4.34315 22 3.17157 20.8284C2 19.6569 2 17.7712 2 14Z"),
                IconPath("M13.5 14H10.5M12 12.5V15.5"),
            ),
        )
        return _medicalKit!!
    }

private var _medicalKit: SolarIcon? = null
