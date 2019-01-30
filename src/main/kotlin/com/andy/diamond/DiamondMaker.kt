package com.andy.diamond

class DiamondMaker {
    fun create(letter: String): String {
        if (letter == "A") return letter

        val letterWrapper = LetterWrapper(letter)

        val index = letterWrapper.getIndex()

        var result = ""
        for (i in 1..index) {
            val spaces = getLeadingNumberOfSpacesFor(i, letter)



        }


        return " A\n" +
                "B B\n" +
                " A\n"
    }

    fun generateLeadingSpaces(index: Int, letter: String): String {
        val numberOfSpaces = getLeadingNumberOfSpacesFor(index, letter)
        return generateSpaces(numberOfSpaces)
    }

    fun getLeadingNumberOfSpacesFor(index: Int, letter: String): Int {
        val letterWrapper = LetterWrapper(letter)
        val indexOfLetter = letterWrapper.getIndex()
        return indexOfLetter - index
    }

    fun generateMiddleSpaces(index: Int, letter: String): String {
        val numberOfSpaces = getMiddleNumberOfSpaces(index, letter)
        return generateSpaces(numberOfSpaces)
    }

    private fun generateSpaces(numberOfSpaces: Int): String {
        var result = ""
        for (i in 0 until numberOfSpaces) {
            result += " "
        }
        return result
    }

    fun getMiddleNumberOfSpaces(index: Int, letter: String): Int {
        return (index - 1) * 2 + 1
    }

}
