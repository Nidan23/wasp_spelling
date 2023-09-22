package com.sjit.ws_backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.sjit.algorithm.letters.Letters
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/algorithm")
class AlgorithmController {

    @GetMapping("/start")
    fun runAlgorithm(): String {
        return Letters().drawLetters().sorted().toString()
    }
}