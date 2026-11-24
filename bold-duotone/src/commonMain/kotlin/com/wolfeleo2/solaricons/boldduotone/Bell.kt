package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Bell: SolarIcon
    get() {
        if (_bell != null) return _bell!!
        _bell = SolarIcon(
            name = "Solar.BoldDuotone.Bell",
            secondaryPaths = listOf(
                IconPath("M18.7491 9V9.7041C18.7491 10.5491 18.9903 11.3752 19.4422 12.0782L20.5496 13.8012C21.5612 15.3749 20.789 17.5139 19.0296 18.0116C14.4273 19.3134 9.57274 19.3134 4.97036 18.0116C3.21105 17.5139 2.43882 15.3749 3.45036 13.8012L4.5578 12.0782C5.00972 11.3752 5.25087 10.5491 5.25087 9.7041V9C5.25087 5.13401 8.27256 2 12 2C15.7274 2 18.7491 5.13401 18.7491 9Z"),
            ),
            primaryPaths = listOf(
                IconPath("M7.24341 18.5449C7.89435 20.5501 9.77792 21.9997 12.0001 21.9997C14.2222 21.9997 16.1058 20.5501 16.7567 18.5449C13.6113 19.1352 10.3888 19.1352 7.24341 18.5449Z"),
            ),
        )
        return _bell!!
    }

private var _bell: SolarIcon? = null
