package com.sjit.algorithm

import com.sjit.algorithm.properties.SetupProperties

class Algorithm {

    private val setupProperties: SetupProperties = SetupProperties()

    fun startAlgorithm() {
        setupProperties.setup()
    }
}