package com.andy.diamond

class DiamondMaker {

    private val letterWrapper = LetterWrapper()

    fun create(letter: String): String {
        if (letter == "A") return letter


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
        val index = letterWrapper.getIndex(letter)

        var result = ""
        for (i in 1..index) {
            result += generateLine(i, letter, result)
        }

        return result
    }

    fun generateBottom(letter: String): String {
        val index = letterWrapper.getIndex(letter)

        var result = ""
        for (i in (index-1) downTo 1) {
            result += generateLine(i, letter, result)
        }

        return result
    }

    private fun generateLine(i: Int, letter: String, result: String): String {
        val char = letterWrapper.getLetter(i)
        var line = generateLeadingSpaces(i, letter)
        line += char
        line += generateMiddleSpaces(i)
        line += char + "\n"
        return line
    }

    fun generatePoint(letter: String): String {
        return generateLeadingSpaces(0, letter) + "A\n"
    }

}
