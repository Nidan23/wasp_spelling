package com.sjit.algorithm.properties

const val numberOfLetters: Int = 7
const val numberOfAllowedSpecialVowels: Int = 1
const val numberOfAllowedSpecialConsonants: Int = 1
const val maxNumberOfAllVowels: Int = 3
const val minNumberOfAllVowels: Int = 1
const val maxNumberOfAllConsonants: Int = numberOfLetters - maxNumberOfAllVowels
const val minNumberOfWords: Int = 150

const val RAW_VOWELS: String = "a;e;i;o;u"
const val RAW_CONSONANTS: String = "b;c;d;f;g;h;j;k;l;m;n;p;r;s;t;w;z"
const val RAW_SPECIAL_VOWELS: String = "ó;y;ą;ę"
const val RAW_SPECIAL_CONSONANTS: String = "ć;ł;ń;ś;ź;ż"

const val SEPARATOR: String = ";"

val vowels: List<String> = setupLetters(RAW_VOWELS, SEPARATOR)
val consonants: List<String> = setupLetters(RAW_CONSONANTS, SEPARATOR)
val specialVowels: List<String> = setupLetters(RAW_SPECIAL_VOWELS, SEPARATOR)
val specialConsonants: List<String> = setupLetters(RAW_SPECIAL_CONSONANTS, SEPARATOR)