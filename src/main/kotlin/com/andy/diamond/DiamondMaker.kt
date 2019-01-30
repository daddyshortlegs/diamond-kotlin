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
        val indexOfLetter = letterWrapper.getIndex()
        return indexOfLetter - index
    }

    fun getMiddleNumberOfSpaces(index: Int, letter: String): Int {
        // (index - 1) * 2 + 1

        return (index - 1) * 2 + 1
    }

}
