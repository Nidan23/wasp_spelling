package com.sjit.algorithm

import com.sjit.algorithm.properties.consonants
import com.sjit.algorithm.properties.specialConsonants
import com.sjit.algorithm.properties.specialVowels
import com.sjit.algorithm.properties.vowels

class Algorithm {

    fun startAlgorithm() {
        vowels.forEach(::println)
        consonants.forEach(::println)
        specialVowels.forEach(::println)
        specialConsonants.forEach(::println)
    }
}