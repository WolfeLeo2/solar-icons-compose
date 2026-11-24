package com.wolfeleo2.solaricons.lineduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.LineDuotone.StationMinimalistic: SolarIcon
    get() {
        if (_stationMinimalistic != null) return _stationMinimalistic!!
        _stationMinimalistic = SolarIcon(
            name = "Solar.LineDuotone.StationMinimalistic",
            secondaryPaths = listOf(
                IconPath("M7.00778 14C5.76601 12.7269 5 10.981 5 9.05473C5 5.15851 8.13401 2 12 2C15.866 2 19 5.15851 19 9.05473C19 10.9647 18.2468 12.6975 17.0235 13.9677"),
                IconPath("M8.98785 12.0044C8.25272 11.2421 7.80005 10.2016 7.80005 9.05461C7.80005 6.71688 9.68045 4.82178 12 4.82178C14.3196 4.82178 16.2 6.71688 16.2 9.05461C16.2 10.1854 15.7601 11.2126 15.0433 11.9718"),
            ),
            primaryPaths = listOf(
                IconPath("M13.25 8.75C13.25 9.44036 12.6904 10 12 10C11.3096 10 10.75 9.44036 10.75 8.75C10.75 8.05964 11.3096 7.5 12 7.5C12.6904 7.5 13.25 8.05964 13.25 8.75Z"),
                IconPath("M16 22L12 10L8 22"),
                IconPath("M14.5 17.5H9.5"),
            ),
        )
        return _stationMinimalistic!!
    }

private var _stationMinimalistic: SolarIcon? = null
