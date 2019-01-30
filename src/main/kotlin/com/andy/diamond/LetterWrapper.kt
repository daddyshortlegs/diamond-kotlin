package com.andy.diamond

class LetterWrapper {
    fun getIndex(letter: String): Int {
        val char = letter[0]
        return char.toInt() - 65
    }

    fun getLetter(i: Int): String {
        val charValue = i + 65
        return charValue.toChar().toString()
    }

}
