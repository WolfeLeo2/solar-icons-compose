package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.CodeCircle: SolarIcon
    get() {
        if (_codeCircle != null) return _codeCircle!!
        _codeCircle = SolarIcon(
            name = "Solar.LineDuotone.CodeCircle",
            secondaryPaths = listOf(
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22Z"),
            ),
            primaryPaths = listOf(
                IconPath("M15.5 9L15.6716 9.17157C17.0049 10.5049 17.6716 11.1716 17.6716 12C17.6716 12.8284 17.0049 13.4951 15.6716 14.8284L15.5 15"),
                IconPath("M13.2942 7.17041L12.0001 12L10.706 16.8297"),
                IconPath("M8.49994 9L8.32837 9.17157C6.99504 10.5049 6.32837 11.1716 6.32837 12C6.32837 12.8284 6.99504 13.4951 8.32837 14.8284L8.49994 15"),
            ),
        )
        return _codeCircle!!
    }

private var _codeCircle: SolarIcon? = null
