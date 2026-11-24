package com.wolfeleo2.solaricons.bold

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Bold.RecordCircle: SolarIcon
    get() {
        if (_recordCircle != null) return _recordCircle!!
        _recordCircle = SolarIcon(
            name = "Solar.Bold.RecordCircle",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M8.75 12C8.75 10.2051 10.2051 8.75 12 8.75C13.7949 8.75 15.25 10.2051 15.25 12C15.25 13.7949 13.7949 15.25 12 15.25C10.2051 15.25 8.75 13.7949 8.75 12Z"),
                IconPath("M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22ZM12 7.25C9.37665 7.25 7.25 9.37665 7.25 12C7.25 14.6234 9.37665 16.75 12 16.75C14.6234 16.75 16.75 14.6234 16.75 12C16.75 9.37665 14.6234 7.25 12 7.25Z", PathFillType.EvenOdd),
            ),
        )
        return _recordCircle!!
    }

private var _recordCircle: SolarIcon? = null
