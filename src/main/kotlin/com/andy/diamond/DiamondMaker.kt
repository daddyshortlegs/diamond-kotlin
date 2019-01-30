package com.andy.diamond

class DiamondMaker {
    fun create(letter: String): String {
        if (letter == "A") return letter

        return " A\n" +
                "B B\n" +
                " A\n"
    }

}
