package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Siren: SolarIcon
    get() {
        if (_siren != null) return _siren!!
        _siren = SolarIcon(
            name = "Solar.LineDuotone.Siren",
            secondaryPaths = listOf(
                IconPath("M20 22V16C20 13.1997 20 11.7996 19.455 10.73C18.9757 9.78924 18.2108 9.02433 17.27 8.54497C16.2004 8 14.8003 8 12 8C9.19974 8 7.79961 8 6.73005 8.54497C5.78924 9.02433 5.02433 9.78924 4.54497 10.73C4 11.7996 4 13.1997 4 16V22"),
                IconPath("M12 19V22"),
            ),
            primaryPaths = listOf(
                IconPath("M15 10.8149C16.23 10.8149 17.23 11.77 17.1851 13"),
                IconPath("M2 22H22"),
                IconPath("M12 2V5"),
                IconPath("M21 5L19.5 6.5"),
                IconPath("M3 5L4.5 6.5"),
                IconPath("M13.5 17.5C13.5 18.3284 12.8284 19 12 19C11.1716 19 10.5 18.3284 10.5 17.5C10.5 16.6716 11.1716 16 12 16C12.8284 16 13.5 16.6716 13.5 17.5Z"),
            ),
        )
        return _siren!!
    }

private var _siren: SolarIcon? = null
