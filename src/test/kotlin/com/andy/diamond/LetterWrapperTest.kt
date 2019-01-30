package com.andy.diamond

import org.junit.Assert.*
import org.junit.Test

class LetterWrapperTest {

    @Test
    fun `should get index of 0 for letter A`() {
        val letterWrapper = LetterWrapper("A")
        assertEquals(0, letterWrapper.getIndex())
    }

    @Test
    fun `should get index of 25 for letter Z`() {
        val letterWrapper = LetterWrapper("Z")
        assertEquals(25, letterWrapper.getIndex())
    }

}