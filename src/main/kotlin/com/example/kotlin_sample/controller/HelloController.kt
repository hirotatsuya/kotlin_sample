package com.example.kotlin_sample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    // /helloというアクセスに対して処理を行う
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello kotlin"
    }
}