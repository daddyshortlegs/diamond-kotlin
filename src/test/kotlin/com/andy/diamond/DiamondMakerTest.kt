package com.andy.diamond

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class DiamondMakerTest {
    val diamondMaker = DiamondMaker()

    @Test
    fun `create A`() {
        val result = diamondMaker.create("A")

        assertEquals("A", result)
    }

    @Test
    fun `create B`() {
        val result = diamondMaker.create("B")

        val expected = " A\n" +
                "B B\n" +
                " A\n"

        assertEquals(expected, result)
    }

    @Test
    @Ignore
    fun `create C`() {
        val result = diamondMaker.create("C")

        val expected =
                "  A\n" +
                " B B\n" +
                "C   C\b"
                " B B\n" +
                "  A\n"

        assertEquals(expected, result)
    }

    @Test
    fun `get leading number of spaces for index 3 for letter D`() {
        val expected =
            "   A\n" +
            "  B B\n" +
            " C   C\n" +
            "D     D\n" +
            " C   C\n" +
            "  B B\n" +
            "   A\n"


        val number: Int = diamondMaker.getLeadingNumberOfSpacesFor(3, "D")
        assertEquals(0, number)
    }

    @Test
    fun `get leading number of spaces for index 2 for letter D`() {
        val number: Int = diamondMaker.getLeadingNumberOfSpacesFor(2, "D")
        assertEquals(1, number)
    }

    @Test
    fun `get leading number of spaces for index 1 for letter D`() {
        val number: Int = diamondMaker.getLeadingNumberOfSpacesFor(1, "D")
        assertEquals(2, number)
    }


}