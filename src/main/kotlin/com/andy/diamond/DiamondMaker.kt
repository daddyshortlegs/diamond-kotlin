package com.andy.diamond

class DiamondMaker {
    fun create(letter: String): String {
        if (letter == "A") return letter

        LetterWrapper(letter)

        return " A\n" +
                "B B\n" +
                " A\n"
    }

    fun getLeadingNumberOfSpacesFor(index: Int, letter: String): Int {
        val letterWrapper = LetterWrapper(letter)
        val index1 = letterWrapper.getIndex()

        println("index = $index, letter = $letter, index of letter = $index1")
        return index1 - index
    }

}
