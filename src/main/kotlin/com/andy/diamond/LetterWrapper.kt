package com.andy.diamond

class LetterWrapper {
    fun getIndex(letter: String): Int {
        val char = letter[0]
        return char.toInt() - 65
    }

}
