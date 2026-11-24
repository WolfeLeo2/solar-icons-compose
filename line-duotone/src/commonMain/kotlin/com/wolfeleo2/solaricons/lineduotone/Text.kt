package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Text: SolarIcon
    get() {
        if (_text != null) return _text!!
        _text = SolarIcon(
            name = "Solar.LineDuotone.Text",
            secondaryPaths = listOf(
                IconPath("M12 3V21"),
            ),
            primaryPaths = listOf(
                IconPath("M20 7.95V7C20 5.11438 20 4.17157 19.4142 3.58579C18.8284 3 17.8856 3 16 3H12H8C6.11438 3 5.17157 3 4.58579 3.58579C4 4.17157 4 5.11438 4 7V7.95"),
                IconPath("M7 21H17"),
            ),
        )
        return _text!!
    }

private var _text: SolarIcon? = null
