package com.example.kotlin_sample.Service

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getHello(): String {
        return "Hello Service"
    }
}