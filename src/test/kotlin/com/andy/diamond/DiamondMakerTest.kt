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
    fun `create C`() {
        val result = diamondMaker.create("C")

        val expected =
                "  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A\n"

        assertEquals(expected, result)
    }

    @Test
    fun `create Z`() {
        val result = diamondMaker.create("Z")

        val expected =
            "                         A\n" +
                    "                        B B\n" +
                    "                       C   C\n" +
                    "                      D     D\n" +
                    "                     E       E\n" +
                    "                    F         F\n" +
                    "                   G           G\n" +
                    "                  H             H\n" +
                    "                 I               I\n" +
                    "                J                 J\n" +
                    "               K                   K\n" +
                    "              L                     L\n" +
                    "             M                       M\n" +
                    "            N                         N\n" +
                    "           O                           O\n" +
                    "          P                             P\n" +
                    "         Q                               Q\n" +
                    "        R                                 R\n" +
                    "       S                                   S\n" +
                    "      T                                     T\n" +
                    "     U                                       U\n" +
                    "    V                                         V\n" +
                    "   W                                           W\n" +
                    "  X                                             X\n" +
                    " Y                                               Y\n" +
                    "Z                                                 Z\n" +
                    " Y                                               Y\n" +
                    "  X                                             X\n" +
                    "   W                                           W\n" +
                    "    V                                         V\n" +
                    "     U                                       U\n" +
                    "      T                                     T\n" +
                    "       S                                   S\n" +
                    "        R                                 R\n" +
                    "         Q                               Q\n" +
                    "          P                             P\n" +
                    "           O                           O\n" +
                    "            N                         N\n" +
                    "             M                       M\n" +
                    "              L                     L\n" +
                    "               K                   K\n" +
                    "                J                 J\n" +
                    "                 I               I\n" +
                    "                  H             H\n" +
                    "                   G           G\n" +
                    "                    F         F\n" +
                    "                     E       E\n" +
                    "                      D     D\n" +
                    "                       C   C\n" +
                    "                        B B\n" +
                    "                         A\n"

        assertEquals(expected, result)
    }


    @Test
    fun `get leading number of spaces for differing indexes for letter D`() {
        assertEquals(0, diamondMaker.getLeadingNumberOfSpacesFor(3, "D"))
        assertEquals(1, diamondMaker.getLeadingNumberOfSpacesFor(2, "D"))
        assertEquals(2, diamondMaker.getLeadingNumberOfSpacesFor(1, "D"))
    }

    @Test
    fun `generate leading spaces`() {
        assertEquals("", diamondMaker.generateLeadingSpaces(3, "D"))
        assertEquals(" ", diamondMaker.generateLeadingSpaces(2, "D"))
        assertEquals("  ", diamondMaker.generateLeadingSpaces(1, "D"))
    }

    @Test
    fun `get number of spaces in middle of line for differeing indexes for letter D`() {
        val expected =
                    "    A\n" +
                    "   B B\n" +
                    "  C   C\n"
                    " D     D\n"
                    "E       E\n"
                    " C   C\n"
                    "  B B\n" +
                    "   A\n"
        // (index - 1) * 2 + 1


        assertEquals(5, diamondMaker.getMiddleNumberOfSpaces(3))
        assertEquals(7, diamondMaker.getMiddleNumberOfSpaces(4))
        assertEquals(9, diamondMaker.getMiddleNumberOfSpaces(5))
    }

    @Test
    fun `generate middle spaces`() {
        assertEquals("     ", diamondMaker.generateMiddleSpaces(3))
        assertEquals("       ", diamondMaker.generateMiddleSpaces(4))
        assertEquals("         ", diamondMaker.generateMiddleSpaces(5))
    }


    @Test
    fun `generate top point`() {
        val top: String = diamondMaker.generatePoint("D")
        assertEquals("   A\n", top)
    }

    @Test
    fun `generate top half`() {
        val top: String = diamondMaker.generateTop("D")
        val expected =
                "  B B\n" +
                " C   C\n" +
                "D     D\n"

        assertEquals(expected, top)
    }

    @Test
    fun `generate bottom half`() {
        val top: String = diamondMaker.generateBottom("D")
        val expected =
                    " C   C\n" +
                    "  B B\n"

        assertEquals(expected, top)
    }

}