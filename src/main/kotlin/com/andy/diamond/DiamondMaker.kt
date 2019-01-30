package com.andy.diamond

class DiamondMaker {
    fun create(letter: String): String {
        if (letter == "A") return letter

        val letterWrapper = LetterWrapper()

        val index = letterWrapper.getIndex(letter)

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
        val letterWrapper = LetterWrapper()
        val indexOfLetter = letterWrapper.getIndex(letter)
        return indexOfLetter - index
    }

    fun generateMiddleSpaces(index: Int): String {
        val numberOfSpaces = getMiddleNumberOfSpaces(index)
        return generateSpaces(numberOfSpaces)
    }

    private fun generateSpaces(numberOfSpaces: Int): String {
        var result = ""
        for (i in 0 until numberOfSpaces) {
            result += " "
        }
        return result
    }

    fun getMiddleNumberOfSpaces(index: Int): Int {
        return (index - 1) * 2 + 1
    }

    fun generateTop(letter: String): String {
        val letterWrapper = LetterWrapper()

        val index = letterWrapper.getIndex(letter)

        var result = ""
        for (i in 1..index) {
            var line = generateLeadingSpaces(i, letter)

            val char = letterWrapper.getLetter(i)
            line += char
            line += generateMiddleSpaces(i)
            line += char + "\n"

            result += line
        }

        return result
    }

}
