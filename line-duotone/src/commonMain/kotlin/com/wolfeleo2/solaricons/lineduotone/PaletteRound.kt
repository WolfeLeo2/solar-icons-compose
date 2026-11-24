package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.PaletteRound: SolarIcon
    get() {
        if (_paletteRound != null) return _paletteRound!!
        _paletteRound = SolarIcon(
            name = "Solar.LineDuotone.PaletteRound",
            secondaryPaths = listOf(
                IconPath("M6 22L18 22C20.2091 22 22 20.2091 22 18C22 15.7909 20.2091 14 18 14L15.5 14"),
                IconPath("M7 18C7 18.5523 6.55228 19 6 19C5.44772 19 5 18.5523 5 18C5 17.4477 5.44772 17 6 17C6.55228 17 7 17.4477 7 18Z"),
            ),
            primaryPaths = listOf(
                IconPath("M2 6C2 3.79086 3.79086 2 6 2C8.20914 2 10 3.79086 10 6V18C10 20.2091 8.20914 22 6 22C3.79086 22 2 20.2091 2 18V6Z"),
                IconPath("M10 8.24256L13.3137 4.9289C14.8758 3.3668 17.4084 3.3668 18.9705 4.9289C20.5326 6.49099 20.5326 9.02365 18.9705 10.5858L9.3064 20.2499"),
            ),
        )
        return _paletteRound!!
    }

private var _paletteRound: SolarIcon? = null
