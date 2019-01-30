package com.andy.diamond

import org.junit.Assert.assertEquals
import org.junit.Test

class DiamondMakerTest {

    @Test
    fun `create A`() {
        val diamondMaker = DiamondMaker()

        val result = diamondMaker.create("A")

        assertEquals("A", result)
    }
}