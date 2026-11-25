package io.github.wolfeleo2.solaricons.core

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorPath
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class SolarIconTest {
    private val icon = SolarIcon(
        name = "Test",
        primaryPaths = listOf(IconPath("M7.5 19C8 20 9 22 12 22", strokeWidth = 1.5f, strokeCap = StrokeCap.Round)),
        secondaryPaths = listOf(IconPath("M2 2H22V22H2Z", clip = "M4 4H20V20H4Z")),
    )

    private fun paths(group: VectorGroup): List<VectorPath> =
        group.flatMap { if (it is VectorGroup) paths(it) else listOf(it as VectorPath) }

    @Test
    fun secondaryAlphaIsAppliedOnce() {
        val (secondary, primary) = paths(icon.imageVector.root)
        assertEquals(0.5f, (secondary.fill as SolidColor).value.alpha, 0.01f)
        assertEquals(1f, secondary.fillAlpha)
        assertEquals(SolarDefaults.PrimaryColor, (primary.stroke as SolidColor).value)
    }

    @Test
    fun strokedPathsAreStrokedNotFilled() {
        val primary = paths(icon.imageVector.root).last()
        assertNull(primary.fill)
        assertEquals(1.5f, primary.strokeLineWidth)
        assertEquals(StrokeCap.Round, primary.strokeLineCap)
    }

    @Test
    fun strokeWidthScales() {
        val primary = paths(icon.asImageVector(strokeWidth = 3f).root).last()
        assertEquals(3f, primary.strokeLineWidth)
    }

    @Test
    fun clipBecomesGroup() {
        val group = icon.imageVector.root.first() as VectorGroup
        assertTrue(group.clipPathData.isNotEmpty())
    }

    @Test
    fun customSecondaryKeepsItsAlphaTimesOpacity() {
        val v = icon.asImageVector(Color.Red, Color.Blue.copy(alpha = 0.8f), secondaryOpacity = 0.5f)
        assertEquals(0.4f, (paths(v.root).first().fill as SolidColor).value.alpha, 0.01f)
    }
}
