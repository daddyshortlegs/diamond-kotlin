package com.andy.diamond

import org.junit.Assert.*
import org.junit.Test

class LetterWrapperTest {

    @Test
    fun `should get index of 0 for letter A`() {
        val letterWrapper = LetterWrapper()
        assertEquals(0, letterWrapper.getIndex("A"))
    }

    @Test
    fun `should get index of 25 for letter Z`() {
        val letterWrapper = LetterWrapper()
        assertEquals(25, letterWrapper.getIndex("Z"))
    }

    @Test
    fun `should get A for index 65`() {
        val letterWrapper = LetterWrapper()
        //assertEquals(0, letterWrapper.getIndex(letter))

    }
}