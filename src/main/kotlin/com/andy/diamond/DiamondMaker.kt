package com.andy.diamond

class DiamondMaker {

    private val letterWrapper = LetterWrapper()

    fun create(letter: String): String {
        if (letter == "A") return letter
        return generatePoint(letter) + generateTop(letter) + generateBottom(letter) + generatePoint(letter)
    }

    fun generatePoint(letter: String): String = generateLeadingSpaces(0, letter) + "A\n"

    fun generateLeadingSpaces(index: Int, letter: String): String = " ".repeat(getLeadingNumberOfSpacesFor(index, letter))

    fun getLeadingNumberOfSpacesFor(index: Int, letter: String): Int = letterWrapper.getIndex(letter) - index

    fun generateTop(letter: String): String = generate(1.rangeTo(letterWrapper.getIndex(letter)), letter)

    fun generateBottom(letter: String): String = generate((letterWrapper.getIndex(letter) - 1).downTo(1), letter)

    private fun generate(rangeTo: IntProgression, letter: String): String {
        var result = ""
        for (i in rangeTo) {
            result += generateLine(i, letter)
        }

        return result
    }

    private fun generateLine(i: Int, letter: String): String {
        val char = letterWrapper.getLetter(i)
        return generateLeadingSpaces(i, letter) + char + generateMiddleSpaces(i) + char + "\n"
    }

    fun generateMiddleSpaces(index: Int): String = " ".repeat(getMiddleNumberOfSpaces(index))

    fun getMiddleNumberOfSpaces(index: Int): Int = (index - 1) * 2 + 1
}
