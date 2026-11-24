package com.wolfeleo2.solaricons.boldduotone

import androidx.compose.ui.graphics.PathFillType
import com.wolfeleo2.solaricons.SolarIcons
import com.wolfeleo2.solaricons.core.IconPath
import com.wolfeleo2.solaricons.core.SolarIcon

public val SolarIcons.BoldDuotone.Eraser: SolarIcon
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = SolarIcon(
            name = "Solar.BoldDuotone.Eraser",
            secondaryPaths = listOf(
                IconPath("M14.9522 3C13.9146 3 13.0796 3.83502 11.4096 5.50506L6.5 10.4146L13.5854 17.5L18.4949 12.5904C20.165 10.9204 21 10.0854 21 9.04776C21 8.01013 20.165 7.1751 18.4949 5.50506C16.8249 3.83502 15.9899 3 14.9522 3Z"),
            ),
            primaryPaths = listOf(
                IconPath("M13.5854 17.4999L6.5 10.4146L5.50506 11.4095C3.83502 13.0795 3 13.9146 3 14.9522C3 15.9898 3.83502 16.8248 5.50506 18.4949C7.1751 20.1649 8.01013 20.9999 9.04776 20.9999C10.0854 20.9999 10.9204 20.1649 12.5904 18.4949L13.5854 17.4999Z"),
                IconPath("M9.03264 21H9C9.01086 21.0003 9.02174 20.9999 9.03264 21Z"),
                IconPath("M9.06287 21C9.85928 20.9938 10.5389 20.4938 11.5734 19.5L21 19.5C21.4142 19.5 21.75 19.8358 21.75 20.25C21.75 20.6642 21.4142 21 21 21H9.06287Z"),
            ),
        )
        return _eraser!!
    }

private var _eraser: SolarIcon? = null
