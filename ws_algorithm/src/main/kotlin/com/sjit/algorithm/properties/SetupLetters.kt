package com.sjit.algorithm.properties

class SetupLetters {

    init {
        vowels.addAll(setupVowels())
        consonants.addAll(setupConsonants())
    }

    private fun setupVowels(): ArrayList<String> {
        val localVowels = "a, e, i, o, u, ó, y, ą, ę"

        println("Vowels: ")
        localVowels.split(", ").forEach(::println)

        return ArrayList()
    }

    private fun setupConsonants(): ArrayList<String> {
        val localConsonants = "b, c, ć, d, f, g, h, j, k, l, ł, m, n, ń, p, r, s, ś, t, w, z, ź, ż"

        println("Consonants")
        localConsonants.split(", ").forEach(::println)

        return ArrayList()
    }
}