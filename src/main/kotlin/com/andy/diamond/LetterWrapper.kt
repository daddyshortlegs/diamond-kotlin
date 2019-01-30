package com.andy.diamond

class LetterWrapper(val letter: String) {
    fun getIndex(): Int {
        val char = letter[0]
        return char.toInt() - 65
    }

}
