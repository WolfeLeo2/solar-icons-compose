package com.wolfeleo2.solaricons.linear

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Linear.Globus: SolarIcon
    get() {
        if (_globus != null) return _globus!!
        _globus = SolarIcon(
            name = "Solar.Linear.Globus",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M12.0 3.0 a7.0 7.0 0 1 0 0 14.0 a7.0 7.0 0 1 0 0 -14.0z"),
                IconPath("M4 16.5623C5.88838 18.6722 8.63263 20 11.687 20C17.3827 20 22 15.3827 22 9.68699C22 6.63263 20.6722 3.88838 18.5623 2"),
                IconPath("M7 4.55263C7.58518 5.10525 8.79066 6.61576 8.93111 8.2368C9.06238 9.75203 10.0268 10.9832 11.5 10.9999C12.0662 11.0063 12.6388 10.5822 12.6373 9.99503C12.6368 9.81346 12.6079 9.62782 12.5627 9.45703C12.4998 9.21948 12.4942 8.94619 12.625 8.66662C13.0824 7.68861 13.982 7.42589 14.6949 6.89475C15.0111 6.65918 15.2995 6.41067 15.4266 6.2105C15.7777 5.65788 16.1289 4.55263 15.9533 4"),
                IconPath("M19 11C18.7804 11.6207 18.625 13.25 16.1455 13.2759C16.1455 13.2759 13.9497 13.2759 13.291 14.5172C12.764 15.5103 13.0714 16.5862 13.291 17"),
                IconPath("M12 22V20"),
                IconPath("M12 22H10"),
                IconPath("M14 22H12"),
            ),
        )
        return _globus!!
    }

private var _globus: SolarIcon? = null
