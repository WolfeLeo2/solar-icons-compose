package com.wolfeleo2.solaricons.broken

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.Broken.SkateboardingRound: SolarIcon
    get() {
        if (_skateboardingRound != null) return _skateboardingRound!!
        _skateboardingRound = SolarIcon(
            name = "Solar.Broken.SkateboardingRound",
            secondaryPaths = emptyList(),
            primaryPaths = listOf(
                IconPath("M3 17L3.60827 17.6759C4.36684 18.5187 5.4475 19 6.58145 19H10M21 17L20.3917 17.6759C19.6332 18.5187 18.5525 19 17.4186 19H14"),
                IconPath("M7.0 20.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
                IconPath("M17.0 20.0 a1.0 1.0 0 1 0 0 2.0 a1.0 1.0 0 1 0 0 -2.0z"),
                IconPath("M19.0 2.0 a2.0 2.0 0 1 0 0 4.0 a2.0 2.0 0 1 0 0 -4.0z"),
                IconPath("M15 16.5V14.3664C15 13.8174 14.7561 13.2967 14.3344 12.9453L13.3379 12.1149C12.6195 11.5162 12.5702 10.4298 13.2315 9.76847L14.8855 8.11449C15.4193 7.58066 15.2452 6.67647 14.5513 6.37908C13.2663 5.82836 11.793 5.94181 10.6075 6.68276L8.5 7.99996"),
                IconPath("M11 14L10.3787 14.6213C9.94513 15.0549 9.72836 15.2716 9.4527 15.3858C9.17705 15.5 8.87049 15.5 8.25736 15.5H7"),
                IconPath("M16.5 10H19.5"),
            ),
        )
        return _skateboardingRound!!
    }

private var _skateboardingRound: SolarIcon? = null
