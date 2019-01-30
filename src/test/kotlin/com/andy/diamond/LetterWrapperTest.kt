package com.andy.diamond

import org.junit.Assert.*
import org.junit.Test

class LetterWrapperTest {
    private val letterWrapper = LetterWrapper()

    @Test
    fun `should get correct index for letter`() {
        assertEquals(0, letterWrapper.getIndex("A"))
        assertEquals(25, letterWrapper.getIndex("Z"))
    }

    @Test
    fun `should get correct character for index`() {
        assertEquals("A", letterWrapper.getLetter(0))
        assertEquals("Z", letterWrapper.getLetter(25))
    }

}
