package com.andy.diamond

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class DiamondMakerTest {

    @Test
    fun `create A`() {
        val diamondMaker = DiamondMaker()

        val result = diamondMaker.create("A")

        assertEquals("A", result)
    }

    @Test
    fun `create B`() {
        val diamondMaker = DiamondMaker()

        val result = diamondMaker.create("B")

        val expected = " A\n" +
                "B B\n" +
                " A\n"

        assertEquals(expected, result)
    }

    @Test
    @Ignore
    fun `create C`() {
        val diamondMaker = DiamondMaker()

        val result = diamondMaker.create("B")

        val expected =
                "  A\n" +
                " B B\n" +
                "C   C\b"
                " B B\n" +
                "  A\n"

        assertEquals(expected, result)
    }

}