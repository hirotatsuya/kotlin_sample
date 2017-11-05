package com.example.kotlin_sample.controller

import com.example.kotlin_sample.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloServiceController(val helloService: HelloService) {

    // /hello/serviceというアクセスに対してserviceを用いて処理を行う
    @GetMapping("/hello/service")
    fun helloService(): String {
        return helloService.getHello()
    }
}
