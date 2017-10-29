package com.example.kotlin_sample.controller

import com.example.kotlin_sample.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloServiceController(val helloService: HelloService) {

    @GetMapping("/hello/service")
    fun helloService(): String {
        return helloService.getHello()
    }
}
