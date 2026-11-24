package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.TextSelection: SolarIcon
    get() {
        if (_textSelection != null) return _textSelection!!
        _textSelection = SolarIcon(
            name = "Solar.Linear.TextSelection",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M9 9H15"),
                IconPath("M12 15L12 9"),
                IconPath("M6 4C6 5.10457 5.10457 6 4 6C2.89543 6 2 5.10457 2 4C2 2.89543 2.89543 2 4 2C5.10457 2 6 2.89543 6 4Z"),
                IconPath("M6 20C6 21.1046 5.10457 22 4 22C2.89543 22 2 21.1046 2 20C2 18.8954 2.89543 18 4 18C5.10457 18 6 18.8954 6 20Z"),
                IconPath("M22 4C22 5.10457 21.1046 6 20 6C18.8954 6 18 5.10457 18 4C18 2.89543 18.8954 2 20 2C21.1046 2 22 2.89543 22 4Z"),
                IconPath("M22 20C22 21.1046 21.1046 22 20 22C18.8954 22 18 21.1046 18 20C18 18.8954 18.8954 18 20 18C21.1046 18 22 18.8954 22 20Z"),
                IconPath("M6 20H18"),
                IconPath("M18 4H6"),
                IconPath("M20 18L20 6"),
                IconPath("M4 6L4 18"),
            ),
        )
        return _textSelection!!
    }

private var _textSelection: SolarIcon? = null
