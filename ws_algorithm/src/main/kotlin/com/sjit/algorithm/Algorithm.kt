package com.sjit.algorithm

import com.sjit.algorithm.letters.Letters


class Algorithm {

    fun startAlgorithm() {
        val chosenLetters = Letters().drawLetters().sorted()

        println(chosenLetters)
    }
}