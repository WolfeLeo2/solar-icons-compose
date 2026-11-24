package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.Scale: SolarIcon
    get() {
        if (_scale != null) return _scale!!
        _scale = SolarIcon(
            name = "Solar.LineDuotone.Scale",
            secondaryPaths = listOf(
                IconPath("M11.0001 2C6.94506 2.0073 4.82162 2.10686 3.46459 3.46389C2.00012 4.92835 2.00012 7.28538 2.00012 11.9994C2.00012 16.7135 2.00012 19.0705 3.46459 20.535C4.92905 21.9994 7.28608 21.9994 12.0001 21.9994C16.7142 21.9994 19.0712 21.9994 20.5357 20.535C21.8927 19.1779 21.9922 17.0545 21.9995 12.9994"),
            ),
            primaryPaths = listOf(
                IconPath("M13 11L22 2M22 2H16.6562M22 2V7.34375M21 3L12 12M12 12H16M12 12V8"),
            ),
        )
        return _scale!!
    }

private var _scale: SolarIcon? = null
