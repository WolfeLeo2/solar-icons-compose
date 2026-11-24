package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.ParagraphSpacing: SolarIcon
    get() {
        if (_paragraphSpacing != null) return _paragraphSpacing!!
        _paragraphSpacing = SolarIcon(
            name = "Solar.LineDuotone.ParagraphSpacing",
            secondaryPaths = listOf(
                IconPath("M4 21H20"),
                IconPath("M4 3H20"),
            ),
            primaryPaths = listOf(
                IconPath("M12 5.5L15 8.5M12 5.5L9 8.5M12 5.5V18.5M12 18.5L15 15.5M12 18.5L9 15.5"),
            ),
        )
        return _paragraphSpacing!!
    }

private var _paragraphSpacing: SolarIcon? = null
