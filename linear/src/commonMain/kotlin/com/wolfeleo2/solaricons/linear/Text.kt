package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Text: SolarIcon
    get() {
        if (_text != null) return _text!!
        _text = SolarIcon(
            name = "Solar.Linear.Text",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12 3H8C6.11438 3 5.17157 3 4.58579 3.58579C4 4.17157 4 5.11438 4 7V7.95M12 3H16C17.8856 3 18.8284 3 19.4142 3.58579C20 4.17157 20 5.11438 20 7V7.95M12 3V21"),
                IconPath("M7 21H17"),
            ),
        )
        return _text!!
    }

private var _text: SolarIcon? = null
