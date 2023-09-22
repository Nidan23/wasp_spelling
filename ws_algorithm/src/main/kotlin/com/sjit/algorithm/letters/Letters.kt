package com.sjit.algorithm.letters;

import com.sjit.algorithm.properties.*

class Letters {
    private var drawnLetters: List<String> = ArrayList()

    fun drawLetters(): List<String> {
        if(shouldDrawSpecialConsonants())
            drawnLetters = drawnLetters.plus(drawSpecialConsonants())
        if(shouldDrawSpecialVowels())
            drawnLetters = drawnLetters.plus(drawSpecialVowels())

        drawnLetters = drawnLetters.plus(drawVowels())
        drawnLetters = drawnLetters.plus(drawConsonants(numberOfLetters - drawnLetters.size))

        return drawnLetters
    }

    private fun shouldDrawSpecialVowels(): Boolean {
        return getRandomNumber(0, 1) == 1
    }

    private fun shouldDrawSpecialConsonants(): Boolean {
        return getRandomNumber(0, 1) == 1
    }

    private fun drawSpecialVowels(): List<String> {
        return drawLetters(specialVowels, getRandomNumber(0, numberOfAllowedSpecialVowels))
    }

    private fun drawSpecialConsonants(): List<String> {
        return drawLetters(specialConsonants, getRandomNumber(0, numberOfAllowedSpecialConsonants))
    }

    private fun drawVowels(): List<String> {
        return drawLetters(vowels, getRandomNumber(minNumberOfAllVowels, maxNumberOfAllVowels))
    }

    private fun drawConsonants(numberOfLettersToChoose: Int): List<String> {
        return drawLetters(consonants, numberOfLettersToChoose)
    }

    private fun drawLetters(lettersToChooseFrom: List<String>, numberOfLettersToChoose: Int): List<String> {
        var drawnLetters: List<String> = ArrayList()

        for (i in 1..numberOfLettersToChoose) {
            val randomLetter: String = drawNotExistingLetter(lettersToChooseFrom, drawnLetters)
            drawnLetters = drawnLetters.plus(randomLetter)
        }

        return drawnLetters
    }

    private fun drawNotExistingLetter(lettersToChooseFrom: List<String>, chosenLetters: List<String>): String {
        var randomLetter: String = lettersToChooseFrom[getRandomNumber(0, lettersToChooseFrom.size - 1)]

        while(chosenLetters.contains(randomLetter)) {
            randomLetter = lettersToChooseFrom[getRandomNumber(0, lettersToChooseFrom.size - 1)]
        }

        return randomLetter
    }

    private fun getRandomNumber(floor: Int, ceiling: Int): Int {
        return (floor..ceiling).random()
    }
}
